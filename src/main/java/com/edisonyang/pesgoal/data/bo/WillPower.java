package com.edisonyang.pesgoal.data.bo;

public class WillPower {
	// ���ԡ���־��������
	private byte tenacity;
	// ��ϡ��ŶӺ���
	private byte teamwork;

	private byte attackAwareness;

	private byte defenceAwareness;

	public byte getTenacity() {
		return tenacity;
	}

	public void setTenacity(byte tenacity) {
		this.tenacity = tenacity;
	}

	public byte getTeamwork() {
		return teamwork;
	}

	public void setTeamwork(byte teamwork) {
		this.teamwork = teamwork;
	}

	public byte getAttackAwareness() {
		return attackAwareness;
	}

	public void setAttackAwareness(byte attackAwareness) {
		this.attackAwareness = attackAwareness;
	}

	public byte getDefenceAwareness() {
		return defenceAwareness;
	}

	public void setDefenceAwareness(byte defenceAwareness) {
		this.defenceAwareness = defenceAwareness;
	}

	@Override
	public String toString() {
		return "WillPower [tenacity=" + tenacity + ", teamwork=" + teamwork
				+ ", attackAwareness=" + attackAwareness
				+ ", defenceAwareness=" + defenceAwareness + "]";
	}
	
}
