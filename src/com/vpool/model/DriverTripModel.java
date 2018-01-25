package com.vpool.model;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class DriverTripModel extends ActionSupport implements Serializable {
	private int tripID, driverID, vehicleID, fareDriverTotal, fareCash, driverShare;
	private String source, destination, expectedTimeOfArrival, expectedTimeOfDestination, createdOn, startTime, endTime,
			status;

	public int getTripID() {
		return tripID;
	}

	public void setTripID(int tripID) {
		this.tripID = tripID;
	}

	public int getDriverID() {
		return driverID;
	}

	public void setDriverID(int driverID) {
		this.driverID = driverID;
	}

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	public int getFareDriverTotal() {
		return fareDriverTotal;
	}

	public void setFareDriverTotal(int fareDriverTotal) {
		this.fareDriverTotal = fareDriverTotal;
	}

	public int getFareCash() {
		return fareCash;
	}

	public void setFareCash(int fareCash) {
		this.fareCash = fareCash;
	}

	public int getDriverShare() {
		return driverShare;
	}

	public void setDriverShare(int driverShare) {
		this.driverShare = driverShare;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getExpectedTimeOfArrival() {
		return expectedTimeOfArrival;
	}

	public void setExpectedTimeOfArrival(String expectedTimeOfArrival) {
		this.expectedTimeOfArrival = expectedTimeOfArrival;
	}

	public String getExpectedTimeOfDestination() {
		return expectedTimeOfDestination;
	}

	public void setExpectedTimeOfDestination(String expectedTimeOfDestination) {
		this.expectedTimeOfDestination = expectedTimeOfDestination;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
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
