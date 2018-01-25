package com.vpool.model;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class PassengerTripModel extends ActionSupport implements Serializable{
	int passengerTripID, tripID, passengerID, farePassTotal;
<<<<<<< HEAD
	String pickupPoint, dropPoint, expectedPickupTime, startTime, endTime, status, payStatus, payMode;
	
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
=======
	String pickupPoint, dropPoint, expectedPickupTime, startTime, endTime, status;
>>>>>>> parent of 807a818... Revert "model classes added"
	public int getPassengerTripID() {
		return passengerTripID;
	}
	public void setPassengerTripID(int passengerTripID) {
		this.passengerTripID = passengerTripID;
	}
	public int getTripID() {
		return tripID;
	}
	public void setTripID(int tripID) {
		this.tripID = tripID;
	}
	public int getPassengerID() {
		return passengerID;
	}
	public void setPassengerID(int passengerID) {
		this.passengerID = passengerID;
	}
	public int getFarePassTotal() {
		return farePassTotal;
	}
	public void setFarePassTotal(int farePassTotal) {
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
	public String getExpectedPickupTime() {
		return expectedPickupTime;
	}
	public void setExpectedPickupTime(String expectedPickupTime) {
		this.expectedPickupTime = expectedPickupTime;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
