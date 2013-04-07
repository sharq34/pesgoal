package com.edisonyang.pesgoal.data.bo;

public class Player {

	// 球员ID
	private int index;

	private String name;

	private String shirtName;
	// ?
	private String spacing;
	// ?
	private String commentary;

	private byte age;
	// 国籍
	private String nationality;

	private String foot;

	private int weight;

	private int height;

	private String form;

	private int growthType;

	private int marketPrice;
	// GK,SW,CB,SB..
	private String positionFit;

	private String position;
	
	private Technique tech;

	private Speed speed;

	private Body body;
	
	private WillPower willPower;
	// 1,2,3,4..
	private String card_S;
	// 1,2,3,4..
	private String card_P;

	private String clubTeam;

	private int number;
	// 国家队
	private String national;

	private PlayerStyle playerStyle;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShirtName() {
		return shirtName;
	}

	public void setShirtName(String shirtName) {
		this.shirtName = shirtName;
	}

	public String getSpacing() {
		return spacing;
	}

	public void setSpacing(String spacing) {
		this.spacing = spacing;
	}

	public String getCommentary() {
		return commentary;
	}

	public void setCommentary(String commentary) {
		this.commentary = commentary;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getFoot() {
		return foot;
	}

	public void setFoot(String foot) {
		this.foot = foot;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public int getGrowthType() {
		return growthType;
	}

	public void setGrowthType(int growthType) {
		this.growthType = growthType;
	}

	public int getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(int marketPrice) {
		this.marketPrice = marketPrice;
	}

	public String getPositionFit() {
		return positionFit;
	}

	public void setPositionFit(String positionFit) {
		this.positionFit = positionFit;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Technique getTech() {
		return tech;
	}

	public void setTech(Technique tech) {
		this.tech = tech;
	}

	public Speed getSpeed() {
		return speed;
	}

	public void setSpeed(Speed speed) {
		this.speed = speed;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public WillPower getWillPower() {
		return willPower;
	}

	public void setWillPower(WillPower willPower) {
		this.willPower = willPower;
	}

	public String getCard_S() {
		return card_S;
	}

	public void setCard_S(String card_S) {
		this.card_S = card_S;
	}

	public String getCard_P() {
		return card_P;
	}

	public void setCard_P(String card_P) {
		this.card_P = card_P;
	}

	public String getClubTeam() {
		return clubTeam;
	}

	public void setClubTeam(String clubTeam) {
		this.clubTeam = clubTeam;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getNational() {
		return national;
	}

	public void setNational(String national) {
		this.national = national;
	}

	public PlayerStyle getPlayerStyle() {
		return playerStyle;
	}

	public void setPlayerStyle(PlayerStyle playerStyle) {
		this.playerStyle = playerStyle;
	}

	@Override
	public String toString() {
		return "Player [index=" + index + ", name=" + name + ", shirtName="
				+ shirtName + ", spacing=" + spacing + ", commentary="
				+ commentary + ", age=" + age + ", nationality=" + nationality
				+ ", foot=" + foot + ", weight=" + weight + ", height="
				+ height + ", form=" + form + ", growthType=" + growthType
				+ ", marketPrice=" + marketPrice + ", positionFit="
				+ positionFit + ", position=" + position + ", tech=" + tech
				+ ", speed=" + speed + ", body=" + body + ", willPower="
				+ willPower + ", card_S=" + card_S + ", card_P=" + card_P
				+ ", clubTeam=" + clubTeam + ", number=" + number
				+ ", national=" + national + ", playerStyle=" + playerStyle
				+ "]";
	}
	
}
