package com.edisonyang.pesgoal.data.bo;

public class PlayerStyle {
	
	private byte skinColor;

	private byte skinTexture;

	private String faceMode;

	private byte linkedFace;

	private int faceSlot;

	private byte linkedHair;

	private int hairSlot;

	private byte boots;
	// ÇòÒÂ²»Èû½ø¶Ì¿ã
	private byte untuckedShirt;
	// ?
	private byte tightKit;

	private byte gloves;

	private byte dribbleStyle;

	private byte freeKickStyle;

	private byte penaltyKickStyle;

	private byte dropKickStyle;

	private byte goalCelebrationStyle1;

	private byte goalCelebrationStyle2;

	public byte getSkinColor() {
		return skinColor;
	}

	public void setSkinColor(byte skinColor) {
		this.skinColor = skinColor;
	}

	public byte getSkinTexture() {
		return skinTexture;
	}

	public void setSkinTexture(byte skinTexture) {
		this.skinTexture = skinTexture;
	}

	public String getFaceMode() {
		return faceMode;
	}

	public void setFaceMode(String faceMode) {
		this.faceMode = faceMode;
	}

	public byte getLinkedFace() {
		return linkedFace;
	}

	public void setLinkedFace(byte linkedFace) {
		this.linkedFace = linkedFace;
	}

	public int getFaceSlot() {
		return faceSlot;
	}

	public void setFaceSlot(int faceSlot) {
		this.faceSlot = faceSlot;
	}

	public byte getLinkedHair() {
		return linkedHair;
	}

	public void setLinkedHair(byte linkedHair) {
		this.linkedHair = linkedHair;
	}

	public int getHairSlot() {
		return hairSlot;
	}

	public void setHairSlot(int hairSlot) {
		this.hairSlot = hairSlot;
	}

	public byte getBoots() {
		return boots;
	}

	public void setBoots(byte boots) {
		this.boots = boots;
	}

	public byte getUntuckedShirt() {
		return untuckedShirt;
	}

	public void setUntuckedShirt(byte untuckedShirt) {
		this.untuckedShirt = untuckedShirt;
	}

	public byte getTightKit() {
		return tightKit;
	}

	public void setTightKit(byte tightKit) {
		this.tightKit = tightKit;
	}

	public byte getGloves() {
		return gloves;
	}

	public void setGloves(byte gloves) {
		this.gloves = gloves;
	}

	public byte getDribbleStyle() {
		return dribbleStyle;
	}

	public void setDribbleStyle(byte dribbleStyle) {
		this.dribbleStyle = dribbleStyle;
	}

	public byte getFreeKickStyle() {
		return freeKickStyle;
	}

	public void setFreeKickStyle(byte freeKickStyle) {
		this.freeKickStyle = freeKickStyle;
	}

	public byte getPenaltyKickStyle() {
		return penaltyKickStyle;
	}

	public void setPenaltyKickStyle(byte penaltyKickStyle) {
		this.penaltyKickStyle = penaltyKickStyle;
	}

	public byte getDropKickStyle() {
		return dropKickStyle;
	}

	public void setDropKickStyle(byte dropKickStyle) {
		this.dropKickStyle = dropKickStyle;
	}

	public byte getGoalCelebrationStyle1() {
		return goalCelebrationStyle1;
	}

	public void setGoalCelebrationStyle1(byte goalCelebrationStyle1) {
		this.goalCelebrationStyle1 = goalCelebrationStyle1;
	}

	public byte getGoalCelebrationStyle2() {
		return goalCelebrationStyle2;
	}

	public void setGoalCelebrationStyle2(byte goalCelebrationStyle2) {
		this.goalCelebrationStyle2 = goalCelebrationStyle2;
	}

	@Override
	public String toString() {
		return "PlayerStyle [skinColor=" + skinColor + ", skinTexture="
				+ skinTexture + ", faceMode=" + faceMode + ", linkedFace="
				+ linkedFace + ", faceSlot=" + faceSlot + ", linkedHair="
				+ linkedHair + ", hairSlot=" + hairSlot + ", boots=" + boots
				+ ", untuckedShirt=" + untuckedShirt + ", tightKit=" + tightKit
				+ ", gloves=" + gloves + ", dribbleStyle=" + dribbleStyle
				+ ", freeKickStyle=" + freeKickStyle + ", penaltyKickStyle="
				+ penaltyKickStyle + ", dropKickStyle=" + dropKickStyle
				+ ", goalCelebrationStyle1=" + goalCelebrationStyle1
				+ ", goalCelebrationStyle2=" + goalCelebrationStyle2 + "]";
	}
	
}
