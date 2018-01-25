package com.vpool.model;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class EmergencyConnectModel extends ActionSupport implements Serializable {
	private int emgID;
	private String emgName, emgContact;

	public int getEmgID() {
		return emgID;
	}

	public void setEmgID(int emgID) {
		this.emgID = emgID;
	}

	public String getEmgName() {
		return emgName;
	}

	public void setEmgName(String emgName) {
		this.emgName = emgName;
	}

	public String getEmgContact() {
		return emgContact;
	}

	public void setEmgContact(String emgContact) {
		this.emgContact = emgContact;
	}

}
