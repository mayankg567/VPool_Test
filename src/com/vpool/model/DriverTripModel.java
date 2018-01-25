package com.vpool.model;

import java.io.Serializable;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class DriverTripModel extends ActionSupport implements Serializable {
	private int tripID;
	private double fareDriverTotal, fareCash, driverShare;
	private String source, destination, status;
	private Date createdOn, startTime, endTime, expectedTimeOfArrival, expectedTimeToDestination;

	public int getTripID() {
		return tripID;
	}

	public void setTripID(int tripID) {
		this.tripID = tripID;
	}

	public double getFareDriverTotal() {
		return fareDriverTotal;
	}

	public void setFareDriverTotal(double fareDriverTotal) {
		this.fareDriverTotal = fareDriverTotal;
	}

	public double getFareCash() {
		return fareCash;
	}

	public void setFareCash(double fareCash) {
		this.fareCash = fareCash;
	}

	public double getDriverShare() {
		return driverShare;
	}

	public void setDriverShare(double driverShare) {
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
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

	public Date getExpectedTimeOfArrival() {
		return expectedTimeOfArrival;
	}

	public void setExpectedTimeOfArrival(Date expectedTimeOfArrival) {
		this.expectedTimeOfArrival = expectedTimeOfArrival;
	}

	public Date getExpectedTimeToDestination() {
		return expectedTimeToDestination;
	}

	public void setExpectedTimeToDestination(Date expectedTimeToDestination) {
		this.expectedTimeToDestination = expectedTimeToDestination;
	}

}
