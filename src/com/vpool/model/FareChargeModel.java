package com.vpool.model;

public class FareChargeModel {
String vehicleType;
int baseFare, chargePerKM, chargePerMinute, driverSharePercent;
public String getVehicleType() {
	return vehicleType;
}
public void setVehicleType(String vehicleType) {
	this.vehicleType = vehicleType;
}
public int getBaseFare() {
	return baseFare;
}
public void setBaseFare(int baseFare) {
	this.baseFare = baseFare;
}
public int getChargePerKM() {
	return chargePerKM;
}
public void setChargePerKM(int chargePerKM) {
	this.chargePerKM = chargePerKM;
}
public int getChargePerMinute() {
	return chargePerMinute;
}
public void setChargePerMinute(int chargePerMinute) {
	this.chargePerMinute = chargePerMinute;
}
public int getDriverSharePercent() {
	return driverSharePercent;
}
public void setDriverSharePercent(int driverSharePercent) {
	this.driverSharePercent = driverSharePercent;
}

}
