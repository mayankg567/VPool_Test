package com.vpool.model;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class UserDocModel extends ActionSupport implements Serializable{
	int udID, uID;
	String aadharNo,panNo, dlNo, aadharLoc, panLoc, dlLoc;
	char dlVerfStatus, panVerfStatus, aadharVerfStatus;
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
	public char getDlVerfStatus() {
		return dlVerfStatus;
	}
	public void setDlVerfStatus(char dlVerfStatus) {
		this.dlVerfStatus = dlVerfStatus;
	}
	public char getPanVerfStatus() {
		return panVerfStatus;
	}
	public void setPanVerfStatus(char panVerfStatus) {
		this.panVerfStatus = panVerfStatus;
	}
	public char getAadharVerfStatus() {
		return aadharVerfStatus;
	}
	public void setAadharVerfStatus(char aadharVerfStatus) {
		this.aadharVerfStatus = aadharVerfStatus;
	}
	
}
