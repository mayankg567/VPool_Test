package com.vpool.model;

import java.io.Serializable;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class FeedbackModel extends ActionSupport implements Serializable {
	private int fbID;
	private String message;
	private Date submitTime;
	private UserModel userID_FK;

	public int getFbID() {
		return fbID;
	}

	public void setFbID(int fbID) {
		this.fbID = fbID;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getSubmitTime() {
		return submitTime;
	}

	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

	public UserModel getUserID_FK() {
		return userID_FK;
	}

	public void setUserID_FK(UserModel userID_FK) {
		this.userID_FK = userID_FK;
	}

}
