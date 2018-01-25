package com.vpool.model;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class AuditFareChargeModel extends ActionSupport implements Serializable{
<<<<<<< HEAD
	int fcID, valueOld, valueNew;
	String fieldName, updateTime;
=======
	int fcID;
	String valueOld, valueNew, fieldName, updateTime;
>>>>>>> parent of 807a818... Revert "model classes added"
	public int getFcID() {
		return fcID;
	}
	public void setFcID(int fcID) {
		this.fcID = fcID;
	}
<<<<<<< HEAD
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
=======
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
>>>>>>> parent of 807a818... Revert "model classes added"
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
