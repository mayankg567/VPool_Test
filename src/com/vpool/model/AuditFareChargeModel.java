package com.vpool.model;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class AuditFareChargeModel extends ActionSupport implements Serializable {

	private int fcID, valueOld, valueNew;
	private String fieldName, updateTime;

	public int getFcID() {
		return fcID;
	}

	public void setFcID(int fcID) {
		this.fcID = fcID;
	}

	public int getValueOld() {
		return valueOld;
	}

	public void setValueOld(int valueOld) {
		this.valueOld = valueOld;
	}

	public int getValueNew() {
		return valueNew;
	}

	public void setValueNew(int valueNew) {
		this.valueNew = valueNew;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
