package com.vpool.model;

import java.io.Serializable;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class OfferModel extends ActionSupport implements Serializable {
	private int offerID;
	private String promoCode, description;
	private String status; // ACTIVE, EXPIRED
	private Date activationDate, expiryDate;
	private String city, state; // name of city/state where offer is applicable
	private double maxDiscountAmt, discountValue;
	private int currentUserCount, maxUserCount, maxAvailCount; // maxAvailCount
																// default=1
	private String discountType; // PERCENT, FLAT, CASHBACK

	public int getOfferID() {
		return offerID;
	}

	public void setOfferID(int offerID) {
		this.offerID = offerID;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getMaxDiscountAmt() {
		return maxDiscountAmt;
	}

	public void setMaxDiscountAmt(double maxDiscountAmt) {
		this.maxDiscountAmt = maxDiscountAmt;
	}

	public double getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(double discountValue) {
		this.discountValue = discountValue;
	}

	public int getCurrentUserCount() {
		return currentUserCount;
	}

	public void setCurrentUserCount(int currentUserCount) {
		this.currentUserCount = currentUserCount;
	}

	public int getMaxUserCount() {
		return maxUserCount;
	}

	public void setMaxUserCount(int maxUserCount) {
		this.maxUserCount = maxUserCount;
	}

	public int getMaxAvailCount() {
		return maxAvailCount;
	}

	public void setMaxAvailCount(int maxAvailCount) {
		this.maxAvailCount = maxAvailCount;
	}

	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

}
