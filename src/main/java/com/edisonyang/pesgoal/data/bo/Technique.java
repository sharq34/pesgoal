package com.edisonyang.pesgoal.data.bo;

public class Technique {
	// 进攻
	private byte attack;

	private byte defence;

	private byte headerAcc;

	private byte dribbleAcc;

	private byte shortPassAcc;

	private byte shortPassSpeed;

	private byte longPassAcc;

	private byte longPassSpeed;

	private byte shotAcc;
	// 定位球
	private byte placeKick;
	// 弧线
	private byte swerve;
	// 控球
	private byte ballCtrl;

	private byte weakFootAcc;

	private byte weakFootFrequency;
	
	private byte goalKeepingSkills;

	public byte getAttack() {
		return attack;
	}

	public void setAttack(byte attack) {
		this.attack = attack;
	}

	public byte getDefence() {
		return defence;
	}

	public void setDefence(byte defence) {
		this.defence = defence;
	}

	public byte getHeaderAcc() {
		return headerAcc;
	}

	public void setHeaderAcc(byte headerAcc) {
		this.headerAcc = headerAcc;
	}

	public byte getDribbleAcc() {
		return dribbleAcc;
	}

	public void setDribbleAcc(byte dribbleAcc) {
		this.dribbleAcc = dribbleAcc;
	}

	public byte getShortPassAcc() {
		return shortPassAcc;
	}

	public void setShortPassAcc(byte shortPassAcc) {
		this.shortPassAcc = shortPassAcc;
	}

	public byte getShortPassSpeed() {
		return shortPassSpeed;
	}

	public void setShortPassSpeed(byte shortPassSpeed) {
		this.shortPassSpeed = shortPassSpeed;
	}

	public byte getLongPassAcc() {
		return longPassAcc;
	}

	public void setLongPassAcc(byte longPassAcc) {
		this.longPassAcc = longPassAcc;
	}

	public byte getLongPassSpeed() {
		return longPassSpeed;
	}

	public void setLongPassSpeed(byte longPassSpeed) {
		this.longPassSpeed = longPassSpeed;
	}

	public byte getShotAcc() {
		return shotAcc;
	}

	public void setShotAcc(byte shotAcc) {
		this.shotAcc = shotAcc;
	}

	public byte getPlaceKick() {
		return placeKick;
	}

	public void setPlaceKick(byte placeKick) {
		this.placeKick = placeKick;
	}

	public byte getSwerve() {
		return swerve;
	}

	public void setSwerve(byte swerve) {
		this.swerve = swerve;
	}

	public byte getBallCtrl() {
		return ballCtrl;
	}

	public void setBallCtrl(byte ballCtrl) {
		this.ballCtrl = ballCtrl;
	}

	public byte getWeakFootAcc() {
		return weakFootAcc;
	}

	public void setWeakFootAcc(byte weakFootAcc) {
		this.weakFootAcc = weakFootAcc;
	}

	public byte getWeakFootFrequency() {
		return weakFootFrequency;
	}

	public void setWeakFootFrequency(byte weakFootFrequency) {
		this.weakFootFrequency = weakFootFrequency;
	}

	public byte getGoalKeepingSkills() {
		return goalKeepingSkills;
	}

	public void setGoalKeepingSkills(byte goalKeepingSkills) {
		this.goalKeepingSkills = goalKeepingSkills;
	}

	@Override
	public String toString() {
		return "Technique [attack=" + attack + ", defence=" + defence
				+ ", headerAcc=" + headerAcc + ", dribbleAcc=" + dribbleAcc
				+ ", shortPassAcc=" + shortPassAcc + ", shortPassSpeed="
				+ shortPassSpeed + ", longPassAcc=" + longPassAcc
				+ ", longPassSpeed=" + longPassSpeed + ", shotAcc=" + shotAcc
				+ ", placeKick=" + placeKick + ", swerve=" + swerve
				+ ", ballCtrl=" + ballCtrl + ", weakFootAcc=" + weakFootAcc
				+ ", weakFootFrequency=" + weakFootFrequency
				+ ", goalKeepingSkills=" + goalKeepingSkills + "]";
	}
	
}
