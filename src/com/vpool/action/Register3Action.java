package com.vpool.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.vpool.model.UserModel;

public class Register3Action extends UserModel implements ServletRequestAware {

	HttpServletRequest request;
	HttpSession session;

	@Override
	public String execute() throws Exception {
		return "";
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		session = request.getSession();
		System.out.println(session.getId());
	}
}
