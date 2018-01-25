package com.vpool.model;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class AuditFareChargeModel extends ActionSupport implements Serializable{
	int fcID;
	String valueOld, valueNew, fieldName, updateTime;
	public int getFcID() {
		return fcID;
	}
	public void setFcID(int fcID) {
		this.fcID = fcID;
	}
	public String getValueOld() {
		return valueOld;
	}
	public void setValueOld(String valueOld) {
		this.valueOld = valueOld;
	}
	public String getValueNew() {
		return valueNew;
	}
	public void setValueNew(String valueNew) {
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
