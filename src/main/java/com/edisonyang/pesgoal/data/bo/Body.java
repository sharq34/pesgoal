package com.edisonyang.pesgoal.data.bo;

public class Body {
	// ¶Ô¿¹
	private byte bodyBalance;
	// ÌåÄÜ
	private byte stamina;

	private byte kickingPower;

	private byte jump;

	private String injury;
	
	public byte getBodyBalance() {
		return bodyBalance;
	}
	public void setBodyBalance(byte bodyBalance) {
		this.bodyBalance = bodyBalance;
	}
	public byte getStamina() {
		return stamina;
	}
	public void setStamina(byte stamina) {
		this.stamina = stamina;
	}
	public byte getKickingPower() {
		return kickingPower;
	}
	public void setKickingPower(byte kickingPower) {
		this.kickingPower = kickingPower;
	}
	public byte getJump() {
		return jump;
	}
	public void setJump(byte jump) {
		this.jump = jump;
	}
	public String getInjury() {
		return injury;
	}
	public void setInjury(String injury) {
		this.injury = injury;
	}
	
	@Override
	public String toString() {
		return "Body [bodyBalance=" + bodyBalance + ", stamina=" + stamina
				+ ", kickingPower=" + kickingPower + ", jump=" + jump
				+ ", injury=" + injury + "]";
	}
}
