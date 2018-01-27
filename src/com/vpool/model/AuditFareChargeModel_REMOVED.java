package com.vpool.model;

import java.io.Serializable;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class AuditFareChargeModel_REMOVED extends ActionSupport implements Serializable {

	private int fcID;
	private double valueOld, valueNew;
	private String fieldName;
	private Date updateTime;

	public int getFcID() {
		return fcID;
	}

	public void setFcID(int fcID) {
		this.fcID = fcID;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public double getValueOld() {
		return valueOld;
	}

	public void setValueOld(double valueOld) {
		this.valueOld = valueOld;
	}

	public double getValueNew() {
		return valueNew;
	}

	public void setValueNew(double valueNew) {
		this.valueNew = valueNew;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
