package com.vpool.model;

import java.io.Serializable;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class PassbookModel extends ActionSupport implements Serializable {
	private int txID;
	private double credit, debit, prevBal, currrentBal;
	private String description; // credited from other user, cashback, added
								// through netbanking, paid for ride
	private Date txTime; // transaction time
	private UserModel userID_FK;

	public Date getTxTime() {
		return txTime;
	}

	public void setTxTime(Date txTime) {
		this.txTime = txTime;
	}

	public int getTxID() {
		return txID;
	}

	public void setTxID(int txID) {
		this.txID = txID;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public double getDebit() {
		return debit;
	}

	public void setDebit(double debit) {
		this.debit = debit;
	}

	public double getPrevBal() {
		return prevBal;
	}

	public void setPrevBal(double prevBal) {
		this.prevBal = prevBal;
	}

	public double getCurrrentBal() {
		return currrentBal;
	}

	public void setCurrrentBal(double currrentBal) {
		this.currrentBal = currrentBal;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UserModel getUserID_FK() {
		return userID_FK;
	}

	public void setUserID_FK(UserModel userID_FK) {
		this.userID_FK = userID_FK;
	}

}
