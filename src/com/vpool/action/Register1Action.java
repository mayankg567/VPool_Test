package com.vpool.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Session;

import com.vpool.model.UserModel;
import com.vpool.util.HBUtil;

public class Register1Action extends UserModel implements ServletRequestAware {

	HttpServletRequest request;
	HttpSession session;

	@Override
	public String execute() throws Exception {
		System.out.println("In Register1Action");
		try {
			Session hbSession = HBUtil.openSession();
			int eotp = RandomNoGenerator.generateNumber();
			System.out.println("Email:" + getEmailID() + "\nOTP:" + eotp);
			SendEmailOTP.sendEmailOtp(getEmailID(), eotp);
			session.setAttribute("emailID", getEmailID());
			session.setAttribute("mobNo", getMobNo());
			HBUtil.closeSF();
			return "success";
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
