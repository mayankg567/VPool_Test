package com.vpool.model;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class AuditDetailsUpdateModel extends ActionSupport implements Serializable {
	private int updateID;
	private String valueOld, valueNew, referredField, referFieldID, referFieldValue, updateTime;

	public int getUpdateID() {
		return updateID;
	}

	public void setUpdateID(int updateID) {
		this.updateID = updateID;
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

	public String getReferredField() {
		return referredField;
	}

	public void setReferredField(String referredField) {
		this.referredField = referredField;
	}

	public String getReferFieldID() {
		return referFieldID;
	}

	public void setReferFieldID(String referFieldID) {
		this.referFieldID = referFieldID;
	}

	public String getReferFieldValue() {
		return referFieldValue;
	}

	public void setReferFieldValue(String referFieldValue) {
		this.referFieldValue = referFieldValue;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
