package com.vpool.model;

import java.io.Serializable;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class ComplaintModel extends ActionSupport implements Serializable {
	private int complaintID;
	private String complaintDescription;
	private String status; // STANDING, RESOLVED
	private Date complaintTime;
	private UserModel registeredBy_FK, registeredAgainst_FK;

	public int getComplaintID() {
		return complaintID;
	}

	public void setComplaintID(int complaintID) {
		this.complaintID = complaintID;
	}

	public String getComplaintDescription() {
		return complaintDescription;
	}

	public void setComplaintDescription(String complaintDescription) {
		this.complaintDescription = complaintDescription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getComplaintTime() {
		return complaintTime;
	}

	public void setComplaintTime(Date complaintTime) {
		this.complaintTime = complaintTime;
	}

	public UserModel getRegisteredBy_FK() {
		return registeredBy_FK;
	}

	public void setRegisteredBy_FK(UserModel registeredBy_FK) {
		this.registeredBy_FK = registeredBy_FK;
	}

	public UserModel getRegisteredAgainst_FK() {
		return registeredAgainst_FK;
	}

	public void setRegisteredAgainst_FK(UserModel registeredAgainst_FK) {
		this.registeredAgainst_FK = registeredAgainst_FK;
	}

}
