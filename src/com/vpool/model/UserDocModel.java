package com.vpool.model;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class UserDocModel extends ActionSupport implements Serializable {
	private int udID, uID;
	private String aadharNo, panNo, dlNo, aadharLoc, panLoc, dlLoc;

	private String dlVerfStatus, panVerfStatus, aadharVerfStatus;

	public int getUdID() {
		return udID;
	}

	public void setUdID(int udID) {
		this.udID = udID;
	}

	public int getuID() {
		return uID;
	}

	public void setuID(int uID) {
		this.uID = uID;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getDlNo() {
		return dlNo;
	}

	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}

	public String getAadharLoc() {
		return aadharLoc;
	}

	public void setAadharLoc(String aadharLoc) {
		this.aadharLoc = aadharLoc;
	}

	public String getPanLoc() {
		return panLoc;
	}

	public void setPanLoc(String panLoc) {
		this.panLoc = panLoc;
	}

	public String getDlLoc() {
		return dlLoc;
	}

	public void setDlLoc(String dlLoc) {
		this.dlLoc = dlLoc;
	}

	public String getDlVerfStatus() {
		return dlVerfStatus;
	}

	public void setDlVerfStatus(String dlVerfStatus) {
		this.dlVerfStatus = dlVerfStatus;
	}

	public String getPanVerfStatus() {
		return panVerfStatus;
	}

	public void setPanVerfStatus(String panVerfStatus) {
		this.panVerfStatus = panVerfStatus;
	}

	public String getAadharVerfStatus() {
		return aadharVerfStatus;
	}

	public void setAadharVerfStatus(String aadharVerfStatus) {
		this.aadharVerfStatus = aadharVerfStatus;
	}

}
