package com.vpool.model;

import java.io.Serializable;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class PassengerTripModel extends ActionSupport implements Serializable {

	private int passengerTripID;
	private double farePassTotal;
	private String pickupPoint, dropPoint, status, payStatus, payMode;
	private Date expectedPickupTime, startTime, endTime;

	public int getPassengerTripID() {
		return passengerTripID;
	}

	public void setPassengerTripID(int passengerTripID) {
		this.passengerTripID = passengerTripID;
	}

	public double getFarePassTotal() {
		return farePassTotal;
	}

	public void setFarePassTotal(double farePassTotal) {
		this.farePassTotal = farePassTotal;
	}

	public String getPickupPoint() {
		return pickupPoint;
	}

	public void setPickupPoint(String pickupPoint) {
		this.pickupPoint = pickupPoint;
	}

	public String getDropPoint() {
		return dropPoint;
	}

	public void setDropPoint(String dropPoint) {
		this.dropPoint = dropPoint;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getPayMode() {
		return payMode;
	}

	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	public Date getExpectedPickupTime() {
		return expectedPickupTime;
	}

	public void setExpectedPickupTime(Date expectedPickupTime) {
		this.expectedPickupTime = expectedPickupTime;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

}
