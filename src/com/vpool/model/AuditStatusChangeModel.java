package com.vpool.model;

import java.io.Serializable;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class AuditStatusChangeModel extends ActionSupport implements Serializable {
	private int statusID;
	private String oldStatus, newStatus;
	private String updatedBy; // ADMIN, SYSTEM
	private String statusType; // user, vehicle, complaint, dtrip, ptrip,
								// userdoc
	private Date updateTime;
	private int referenceID; // contains PK values of userID, vehicleID, udID,
								// complainID, tripID, passengerTripID

	public int getStatusID() {
		return statusID;
	}

	public void setStatusID(int statusID) {
		this.statusID = statusID;
	}

	public String getOldStatus() {
		return oldStatus;
	}

	public void setOldStatus(String oldStatus) {
		this.oldStatus = oldStatus;
	}

	public String getNewStatus() {
		return newStatus;
	}

	public void setNewStatus(String newStatus) {
		this.newStatus = newStatus;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getStatusType() {
		return statusType;
	}

	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}

	public int getReferenceID() {
		return referenceID;
	}

	public void setReferenceID(int referenceID) {
		this.referenceID = referenceID;
	}

}
