package com.vpool.model;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class VehicleDetailsModel extends ActionSupport implements Serializable {
	int userID, vehicleID, seatAvailable;
	String vehicleType, status, companyName, modelName, modelVer, chesisNo, insuranceNo, licensePlateNo, fuelType;
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	public int getSeatAvailable() {
		return seatAvailable;
	}
	public void setSeatAvailable(int seatAvailable) {
		this.seatAvailable = seatAvailable;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getModelVer() {
		return modelVer;
	}
	public void setModelVer(String modelVer) {
		this.modelVer = modelVer;
	}
	public String getChesisNo() {
		return chesisNo;
	}
	public void setChesisNo(String chesisNo) {
		this.chesisNo = chesisNo;
	}
	public String getInsuranceNo() {
		return insuranceNo;
	}
	public void setInsuranceNo(String insuranceNo) {
		this.insuranceNo = insuranceNo;
	}
	public String getLicensePlateNo() {
		return licensePlateNo;
	}
	public void setLicensePlateNo(String licensePlateNo) {
		this.licensePlateNo = licensePlateNo;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
}
