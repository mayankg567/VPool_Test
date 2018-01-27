package com.vpool.model;

import java.io.Serializable;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class AuditLoginModel extends ActionSupport implements Serializable {
	private int logID;

	private UserModel userID_FK;

	private String status; // FAILED, SUCCESSFUL
	private Date loginTime;

	public int getLogID() {
		return logID;
	}

	public void setLogID(int logID) {
		this.logID = logID;
	}

	public UserModel getUserID_FK() {
		return userID_FK;
	}

	public void setUserID_FK(UserModel userID_FK) {
		this.userID_FK = userID_FK;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

}
