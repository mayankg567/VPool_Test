package com.vpool.action;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vpool.middle.EncryptText;
import com.vpool.model.AuditLoginModel;
import com.vpool.model.UserModel;
import com.vpool.util.HBUtil;

public class UserLoginAction extends UserModel implements ServletRequestAware {
	HttpServletRequest request;
	HttpSession session;

	Session hbSession;
	AuditLoginModel auditLogin = new AuditLoginModel();
	Transaction auditTx;

	@Override
	public String execute() throws Exception {
		try {
			System.out.println("In user login action");
			String email = request.getParameter("email");
			System.out.println("email is:" + email);
			String pass = request.getParameter("pass");
			String encpass = new EncryptText().getMD5(pass);
			hbSession = HBUtil.openSession();
			String qry = "from UserModel where emailID=:emID";
			Query q1 = hbSession.createQuery(qry);
			System.out.println("create query success");

			q1.setString("emID", email);

			List userList = q1.list();
			System.out.println("list size:" + userList.size());
			auditTx = hbSession.beginTransaction();

			auditLogin.setLoginTime(new Date());
			if (userList.isEmpty()) {
				System.out.println("record not found");
				auditLogin.setStatus("FAILED");
				auditLogin.setUserID_FK(null);
				hbSession.save(auditLogin);
				auditTx.commit();
				HBUtil.closeSF();
				return "error";

			} else {
				UserModel um1 = (UserModel) userList.get(0);
				System.out.println("user found");
				System.out.println(um1.getFirstName());

				if (encpass.equals(um1.getPass())) {

					auditLogin.setStatus("SUCCESSFUL");
					auditLogin.setUserID_FK(um1);
					hbSession.save(auditLogin);
					auditTx.commit();
					HBUtil.closeSF();
					return "success";
				} else {
					auditLogin.setStatus("FAILED");
					auditLogin.setUserID_FK(um1);
					hbSession.save(auditLogin);
					auditTx.commit();
					HBUtil.closeSF();
					return "error";
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			hbSession = HBUtil.openSession();
			auditTx = hbSession.beginTransaction();
			auditLogin.setLoginTime(new Date());
			auditLogin.setStatus("FAILED");
			auditLogin.setUserID_FK(null);
			hbSession.save(auditLogin);
			auditTx.commit();
			HBUtil.closeSF();
			return "error";
		}
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		session = request.getSession();
		System.out.println(session.getId());
	}
}
