package com.vpool.model;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class ComplaintModel extends ActionSupport implements Serializable {
	int complaintID, tripID;
	String registeredBy, registeredAgainst, complaintDescription, registeredOn, status;
	
	public int getComplaintID() {
		return complaintID;
	}
	public void setComplaintID(int complaintID) {
		this.complaintID = complaintID;
	}
	public int getTripID() {
		return tripID;
	}
	public void setTripID(int tripID) {
		this.tripID = tripID;
	}
	public String getRegisteredBy() {
		return registeredBy;
	}
	public void setRegisteredBy(String registeredBy) {
		this.registeredBy = registeredBy;
	}
	public String getRegisteredAgainst() {
		return registeredAgainst;
	}
	public void setRegisteredAgainst(String registeredAgainst) {
		this.registeredAgainst = registeredAgainst;
	}
	public String getComplaintDescription() {
		return complaintDescription;
	}
	public void setComplaintDescription(String complaintDescription) {
		this.complaintDescription = complaintDescription;
	}
	public String getRegisteredOn() {
		return registeredOn;
	}
	public void setRegisteredOn(String registeredOn) {
		this.registeredOn = registeredOn;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
