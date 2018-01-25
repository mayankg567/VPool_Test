package com.vpool.model;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class AboutUsModel extends ActionSupport implements Serializable {
	private String tagLine, description, mobNo, altMobNo, telephone, address, mission, vision;

	public String getTagLine() {
		return tagLine;
	}

	public void setTagLine(String tagLine) {
		this.tagLine = tagLine;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getAltMobNo() {
		return altMobNo;
	}

	public void setAltMobNo(String altMobNo) {
		this.altMobNo = altMobNo;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMission() {
		return mission;
	}

	public void setMission(String mission) {
		this.mission = mission;
	}

	public String getVision() {
		return vision;
	}

	public void setVision(String vision) {
		this.vision = vision;
	}

}
