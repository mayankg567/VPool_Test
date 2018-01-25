package com.vpool.model;

import java.io.Serializable;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class ContactUsModel extends ActionSupport implements Serializable {
	private int queryID;
	private String emailID, queryMessage, mobNo;
	private Date submitTime;

	public int getQueryID() {
		return queryID;
	}

	public void setQueryID(int queryID) {
		this.queryID = queryID;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getQueryMessage() {
		return queryMessage;
	}

	public void setQueryMessage(String queryMessage) {
		this.queryMessage = queryMessage;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public Date getSubmitTime() {
		return submitTime;
	}

	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

}
