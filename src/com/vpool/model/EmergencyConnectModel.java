package com.vpool.model;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class EmergencyConnectModel extends ActionSupport implements Serializable {
	private int emgID;
	private String emgName1, emgContact1;
	private String emgName2, emgContact2;
	private UserModel userID_FK;

	public int getEmgID() {
		return emgID;
	}

	public void setEmgID(int emgID) {
		this.emgID = emgID;
	}

	public String getEmgName1() {
		return emgName1;
	}

	public void setEmgName1(String emgName1) {
		this.emgName1 = emgName1;
	}

	public String getEmgContact1() {
		return emgContact1;
	}

	public void setEmgContact1(String emgContact1) {
		this.emgContact1 = emgContact1;
	}

	public String getEmgName2() {
		return emgName2;
	}

	public void setEmgName2(String emgName2) {
		this.emgName2 = emgName2;
	}

	public String getEmgContact2() {
		return emgContact2;
	}

	public void setEmgContact2(String emgContact2) {
		this.emgContact2 = emgContact2;
	}

	public UserModel getUserID_FK() {
		return userID_FK;
	}

	public void setUserID_FK(UserModel userID_FK) {
		this.userID_FK = userID_FK;
	}

}
