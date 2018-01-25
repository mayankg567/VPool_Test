package com.vpool.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.vpool.model.UserModel;

public class Register1Action extends UserModel implements ServletRequestAware {
	@Override
	public String execute() throws Exception {
		return "";
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {

	}
}
