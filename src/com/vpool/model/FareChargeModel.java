package com.vpool.model;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class FareChargeModel extends ActionSupport implements Serializable {

	private String vehicleType;
	private double baseFare, chargePerKM, chargePerMinute, driverSharePercent;

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
