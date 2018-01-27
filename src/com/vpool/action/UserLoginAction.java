package com.vpool.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Query;
import org.hibernate.Session;

import com.vpool.middle.EncryptText;
import com.vpool.model.UserModel;
import com.vpool.util.HBUtil;

public class UserLoginAction extends UserModel implements ServletRequestAware {
	HttpServletRequest request;
	HttpSession session;

	@Override
	public String execute() throws Exception {
		try {
			System.out.println("In user login action");
			String email = request.getParameter("email");
			System.out.println("email is:" + email);
			String pass = request.getParameter("pass");
			String encpass = new EncryptText().getMD5(pass);
			Session hbSession = HBUtil.openSession();
			String qry = "from UserModel where emailID=:emID and pass=:pass";
			Query q1 = hbSession.createQuery(qry);
			System.out.println("create query success");

			q1.setString("emID", email);
			q1.setString("pass", encpass);

			List userList = q1.list();
			System.out.println("list size:" + userList.size());
			if (userList != null) {
				UserModel um1 = (UserModel) userList.get(0);
				System.out.println("user found");
				System.out.println(um1.getFirstName());
				HBUtil.closeSF();
				return "success";

			} else {
				System.out.println("record not found");
				HBUtil.closeSF();
				return "error";
			}

		} catch (Exception e) {
			e.printStackTrace();
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
