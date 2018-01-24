package com.vpool.model;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class AuditLoginModel extends ActionSupport implements Serializable {
	int logID, userID;
	String loginTime, status;
	public int getLogID() {
		return logID;
	}
	public void setLogID(int logID) {
		this.logID = logID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
