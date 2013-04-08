package com.edisonyang.pesgoal.data.bo;

import java.util.List;

public class Team {
	private int teamId;
	private String teamName;
	private String teamNameEN;
	private String shortName;
	private int stadium;
	private byte chantsSlot;
	private int flagSlot;
	private List<TeamMember> member;
	private byte longFK;
	private byte shortFK;
	private byte FK2;
	private byte cornerL;
	private byte cornerR;
	private byte penalty;
	private byte captain;
	private boolean isClub;
	private int leauageId;
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public int getStadium() {
		return stadium;
	}
	public void setStadium(int stadium) {
		this.stadium = stadium;
	}
	public byte getChantsSlot() {
		return chantsSlot;
	}
	public void setChantsSlot(byte chantsSlot) {
		this.chantsSlot = chantsSlot;
	}
	public int getFlagSlot() {
		return flagSlot;
	}
	public void setFlagSlot(int flagSlot) {
		this.flagSlot = flagSlot;
	}
	public List<TeamMember> getMember() {
		return member;
	}
	public void setMember(List<TeamMember> member) {
		this.member = member;
	}
	public byte getLongFK() {
		return longFK;
	}
	public void setLongFK(byte longFK) {
		this.longFK = longFK;
	}
	public byte getShortFK() {
		return shortFK;
	}
	public void setShortFK(byte shortFK) {
		this.shortFK = shortFK;
	}
	public byte getFK2() {
		return FK2;
	}
	public void setFK2(byte fK2) {
		FK2 = fK2;
	}
	public byte getCornerL() {
		return cornerL;
	}
	public void setCornerL(byte cornerL) {
		this.cornerL = cornerL;
	}
	public byte getCornerR() {
		return cornerR;
	}
	public void setCornerR(byte cornerR) {
		this.cornerR = cornerR;
	}
	public byte getPenalty() {
		return penalty;
	}
	public void setPenalty(byte penalty) {
		this.penalty = penalty;
	}
	public byte getCaptain() {
		return captain;
	}
	public void setCaptain(byte captain) {
		this.captain = captain;
	}
	public boolean isClub() {
		return isClub;
	}
	public void setClub(boolean isClub) {
		this.isClub = isClub;
	}
	public int getLeauageId() {
		return leauageId;
	}
	public void setLeauageId(int leauageId) {
		this.leauageId = leauageId;
	}
	public String getTeamNameEN() {
		return teamNameEN;
	}
	public void setTeamNameEN(String teamNameEN) {
		this.teamNameEN = teamNameEN;
	}
	
	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName
				+ ", teamNameEN=" + teamNameEN + ", shortName=" + shortName
				+ ", stadium=" + stadium + ", chantsSlot=" + chantsSlot
				+ ", flagSlot=" + flagSlot + ", member=" + member + ", longFK="
				+ longFK + ", shortFK=" + shortFK + ", FK2=" + FK2
				+ ", cornerL=" + cornerL + ", cornerR=" + cornerR
				+ ", penalty=" + penalty + ", captain=" + captain + ", isClub="
				+ isClub + ", leauageId=" + leauageId + "]";
	}
	
}
