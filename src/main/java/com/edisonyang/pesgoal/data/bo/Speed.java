package com.edisonyang.pesgoal.data.bo;

public class Speed {
	private byte response;
	// 爆发力
	private byte explosivePower;
	// 盘带速度
	private byte dribbleSpeed;

	private byte topSpeed;

	public byte getResponse() {
		return response;
	}

	public void setResponse(byte response) {
		this.response = response;
	}

	public byte getExplosivePower() {
		return explosivePower;
	}

	public void setExplosivePower(byte explosivePower) {
		this.explosivePower = explosivePower;
	}

	public byte getDribbleSpeed() {
		return dribbleSpeed;
	}

	public void setDribbleSpeed(byte dribbleSpeed) {
		this.dribbleSpeed = dribbleSpeed;
	}

	public byte getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(byte topSpeed) {
		this.topSpeed = topSpeed;
	}

	@Override
	public String toString() {
		return "Speed [response=" + response + ", explosivePower="
				+ explosivePower + ", dribbleSpeed=" + dribbleSpeed
				+ ", topSpeed=" + topSpeed + "]";
	}
	
}
