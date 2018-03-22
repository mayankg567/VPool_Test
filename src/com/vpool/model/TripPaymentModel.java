package com.vpool.model;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class TripPaymentModel extends ActionSupport implements Serializable {
	private int payID;
	private String payMode; // WALLET, CASH, CARD, CASH_WALLET, CARD_WALLET
	private double payAmount, payWallet;
	private String payStatus; // PENDING, COMPLETED, CANCELLED
	private PassengerTripModel ptID_FK;

	public int getPayID() {
		return payID;
	}

	public void setPayID(int payID) {
		this.payID = payID;
	}

	public String getPayMode() {
		return payMode;
	}

	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	public double getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(double payAmount) {
		this.payAmount = payAmount;
	}

	public double getPayWallet() {
		return payWallet;
	}

	public void setPayWallet(double payWallet) {
		this.payWallet = payWallet;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public PassengerTripModel getPtID_FK() {
		return ptID_FK;
	}

	public void setPtID_FK(PassengerTripModel ptID_FK) {
		this.ptID_FK = ptID_FK;
	}

}
