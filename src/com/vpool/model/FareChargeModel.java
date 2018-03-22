package com.vpool.model;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class FareChargeModel extends ActionSupport implements Serializable {

	private String vehicleType; // TWO, FOUR
	private double baseFare, chargePerKM, chargePerMinute, driverSharePercent;
	private int fcID;
	private String city, state;

	public int getFcID() {
		return fcID;
	}

	public void setFcID(int fcID) {
		this.fcID = fcID;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public double getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(double baseFare) {
		this.baseFare = baseFare;
	}

	public double getChargePerKM() {
		return chargePerKM;
	}

	public void setChargePerKM(double chargePerKM) {
		this.chargePerKM = chargePerKM;
	}

	public double getChargePerMinute() {
		return chargePerMinute;
	}

	public void setChargePerMinute(double chargePerMinute) {
		this.chargePerMinute = chargePerMinute;
	}

	public double getDriverSharePercent() {
		return driverSharePercent;
	}

	public void setDriverSharePercent(double driverSharePercent) {
		this.driverSharePercent = driverSharePercent;
	}

}
