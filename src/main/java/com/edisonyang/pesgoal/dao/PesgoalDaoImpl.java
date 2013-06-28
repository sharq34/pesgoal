package com.edisonyang.pesgoal.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.edisonyang.pesgoal.data.bo.Body;
import com.edisonyang.pesgoal.data.bo.Player;
import com.edisonyang.pesgoal.data.bo.PlayerStyle;
import com.edisonyang.pesgoal.data.bo.Speed;
import com.edisonyang.pesgoal.data.bo.Team;
import com.edisonyang.pesgoal.data.bo.Technique;
import com.edisonyang.pesgoal.data.bo.WillPower;

public class PesgoalDaoImpl implements IPesgoalDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	private SimpleJdbcTemplate simpleJdbcTemplate;
	private static Logger logger = Logger.getLogger(PesgoalDaoImpl.class);

	public PesgoalDaoImpl() {
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(
				dataSource);
		this.simpleJdbcTemplate = new SimpleJdbcTemplate(dataSource);
	}

	public int savePlayer(Player player) {

		Speed speed = player.getSpeed();
		Body body = player.getBody();
		PlayerStyle style = player.getPlayerStyle();
		Technique tech = player.getTech();
		WillPower wp = player.getWillPower();

		saveSpeed(player.getPlayerId(), speed);
		saveBody(player.getPlayerId(), body);
		saveWillPower(player.getPlayerId(), wp);
		saveTechnique(player.getPlayerId(), tech);
		saveStyle(player.getPlayerId(), style);

		int result = jdbcTemplate
				.update("insert into player(id,name,shirtname,spacing,commentary,age,"
						+ "notionality,foot,weight,height,form,growth_type,market_price,"
						+ "position_fit,position,card_s,card_p,club_team,number,national_team) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
						new Object[] { player.getPlayerId(), player.getName(),
								player.getShirtName(), player.getSpacing(),
								player.getCommentary(), player.getAge(),
								player.getNationality(), player.getFoot(),
								player.getWeight(), player.getHeight(),
								player.getForm(), player.getGrowthType(),
								player.getMarketPrice(),
								player.getPositionFit(), player.getPosition(),
								player.getCard_S(), player.getCard_P(),
								player.getClubTeam(), player.getNumber(),
								player.getNational() }, new int[] {
								java.sql.Types.INTEGER, java.sql.Types.CHAR,
								java.sql.Types.CHAR, java.sql.Types.CHAR,
								java.sql.Types.CHAR, java.sql.Types.TINYINT,
								java.sql.Types.CHAR, java.sql.Types.CHAR,
								java.sql.Types.INTEGER, java.sql.Types.INTEGER,
								java.sql.Types.CHAR, java.sql.Types.INTEGER,
								java.sql.Types.INTEGER, java.sql.Types.CHAR,
								java.sql.Types.CHAR, java.sql.Types.CHAR,
								java.sql.Types.CHAR, java.sql.Types.CHAR,
								java.sql.Types.INTEGER, java.sql.Types.CHAR });

		if (result != 1)
			logger.error("id为 " + player.getPlayerId()
					+ " 的球员[Player]信息没有正确入库。");

		return result;
	}

	private int saveSpeed(int id, Speed speed) {
		int result = jdbcTemplate
				.update("insert into speed(id,response,explosive_power,dribble_speed,top_speed) values(?,?,?,?,?)",
						new Object[] { id, speed.getResponse(),
								speed.getExplosivePower(),
								speed.getDribbleSpeed(), speed.getTopSpeed() },
						new int[] { java.sql.Types.INTEGER,
								java.sql.Types.TINYINT, java.sql.Types.TINYINT,
								java.sql.Types.TINYINT, java.sql.Types.TINYINT });

		if (result != 1)
			logger.error("id为 " + id + " 的球员[速度Speed]信息没有正确入库。");

		return result;
	}

	private int saveBody(int id, Body body) {
		int result = jdbcTemplate
				.update("insert into body(id,body_balance,stamina,kicking_power,jump,injury) values(?,?,?,?,?,?)",
						new Object[] { id, body.getBodyBalance(),
								body.getStamina(), body.getKickingPower(),
								body.getJump(), body.getInjury() }, new int[] {
								java.sql.Types.INTEGER, java.sql.Types.TINYINT,
								java.sql.Types.TINYINT, java.sql.Types.TINYINT,
								java.sql.Types.TINYINT, java.sql.Types.CHAR });
		if (result != 1)
			logger.error("id为 " + id + " 的球员[身体Body]信息没有正确入库。");

		return result;
	}

	private int saveWillPower(int id, WillPower wp) {
		int result = jdbcTemplate
				.update("insert into willpower(id,tenacity,teamwork,attack_awareness,defence_awareness) values(?,?,?,?,?)",
						new Object[] { id, wp.getTenacity(), wp.getTeamwork(),
								wp.getAttackAwareness(),
								wp.getDefenceAwareness() }, new int[] {
								java.sql.Types.INTEGER, java.sql.Types.TINYINT,
								java.sql.Types.TINYINT, java.sql.Types.TINYINT,
								java.sql.Types.TINYINT });
		if (result != 1)
			logger.error("id为 " + id + " 的球员[精神WillPower]信息没有正确入库。");

		return result;
	}

	private int saveTechnique(int id, Technique tech) {
		int result = jdbcTemplate
				.update("insert into technique(id,attack,defence,header_acc,dribble_acc,short_pass_acc,short_pass_speed,long_pass_acc,"
						+ "long_pass_speed,shot_acc,place_kick,swerve,ball_ctrl,weak_foot_acc,weak_foot_frequency,goalkeeping_skills) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
						new Object[] { id, tech.getAttack(), tech.getDefence(),
								tech.getHeaderAcc(), tech.getDribbleAcc(),
								tech.getShortPassAcc(),
								tech.getShortPassSpeed(),
								tech.getLongPassAcc(), tech.getLongPassSpeed(),
								tech.getShotAcc(), tech.getPlaceKick(),
								tech.getSwerve(), tech.getBallCtrl(),
								tech.getWeakFootAcc(),
								tech.getWeakFootFrequency(),
								tech.getGoalKeepingSkills() },
						new int[] { java.sql.Types.INTEGER,
								java.sql.Types.TINYINT, java.sql.Types.TINYINT,
								java.sql.Types.TINYINT, java.sql.Types.TINYINT,
								java.sql.Types.TINYINT, java.sql.Types.TINYINT,
								java.sql.Types.TINYINT, java.sql.Types.TINYINT,
								java.sql.Types.TINYINT, java.sql.Types.TINYINT,
								java.sql.Types.TINYINT, java.sql.Types.TINYINT,
								java.sql.Types.TINYINT, java.sql.Types.TINYINT,
								java.sql.Types.TINYINT });

		if (result != 1)
			logger.error("id为 " + id + " 的球员[技术Technique]信息没有正确入库。");

		return result;
	}

	private int saveStyle(int id, PlayerStyle style) {
		int result = jdbcTemplate
				.update("insert into player_style(id,skin_color,skin_texture,face_mode,linked_face,face_slot,linked_hair,hair_slot,boots,untucked_shirt,"
						+ "tight_kit,gloves,dribble_style,free_kick_style,penalty_kick_style,drop_kick_style,goal_celebration_style_1,goal_celebration_style_2) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
						new Object[] { id, style.getSkinColor(),
								style.getSkinTexture(), style.getFaceMode(),
								style.getLinkedFace(), style.getFaceSlot(),
								style.getLinkedHair(), style.getHairSlot(),
								style.getBoots(), style.getUntuckedShirt(),
								style.getTightKit(), style.getGloves(),
								style.getDribbleStyle(),
								style.getFreeKickStyle(),
								style.getPenaltyKickStyle(),
								style.getDropKickStyle(),
								style.getGoalCelebrationStyle1(),
								style.getGoalCelebrationStyle2() },
						new int[] { java.sql.Types.INTEGER,
								java.sql.Types.TINYINT, java.sql.Types.TINYINT,
								java.sql.Types.CHAR, java.sql.Types.TINYINT,
								java.sql.Types.INTEGER, java.sql.Types.TINYINT,
								java.sql.Types.INTEGER, java.sql.Types.TINYINT,
								java.sql.Types.TINYINT, java.sql.Types.TINYINT,
								java.sql.Types.TINYINT, java.sql.Types.TINYINT,
								java.sql.Types.TINYINT, java.sql.Types.TINYINT,
								java.sql.Types.TINYINT, java.sql.Types.TINYINT,
								java.sql.Types.TINYINT });
		if (result != 1)
			logger.error("id为 " + id + " 的球员[样式PlayerStyle]信息没有正确入库。");

		return result;
	}

	public int saveAllPlayers(List<Player> playerList) {
		Iterator it = playerList.iterator();
		int sum = 0;
		while (it.hasNext()) {
			Player player = (Player) it.next();
			int result = savePlayer(player);
			if (result != 1)
				logger.error("id为 " + player.getPlayerId() + " 的球员信息没有正确入库。");
			else
				sum += result;
		}
		return sum;
	}

	public void delete() {
		// TODO Auto-generated method stub

	}

	public int saveTeam(Team team) {

		Map<Byte, String> member = team.getMember();
		int teamId = team.getTeamId();
		String teamName = team.getTeamName();
		
		//int sum = saveTeamMember(member, teamId, teamName);

		int result = jdbcTemplate
				.update("insert into team(id,team_name,team_name_en,short_name,stadium,chants_slot,flag_slot,"
						+ "long_fk,short_fk,fk2,corner_l,corner_r,penalty,captain) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
						new Object[] {
								teamId,
								teamName,
								team.getTeamNameEN(),
								team.getShortName(),
								team.getStadium(),
								team.getChantsSlot(),
								team.getFlagSlot(),
								getPlayerIdByNumber(member, team.getLongFK(),
										teamName),
								getPlayerIdByNumber(member, team.getShortFK(),
										teamName),
								getPlayerIdByNumber(member, team.getFK2(),
										teamName),
								getPlayerIdByNumber(member, team.getCornerL(),
										teamName),
								getPlayerIdByNumber(member, team.getCornerR(),
										teamName),
								getPlayerIdByNumber(member, team.getPenalty(),
										teamName),
								getPlayerIdByNumber(member, team.getCaptain(),
										teamName) },
						new int[] { java.sql.Types.INTEGER,
								java.sql.Types.CHAR, java.sql.Types.CHAR,
								java.sql.Types.CHAR, java.sql.Types.INTEGER,
								java.sql.Types.TINYINT, java.sql.Types.INTEGER,
								java.sql.Types.INTEGER, java.sql.Types.INTEGER,
								java.sql.Types.INTEGER, java.sql.Types.INTEGER,
								java.sql.Types.INTEGER, java.sql.Types.INTEGER,
								java.sql.Types.INTEGER });
		if (result != 1)
			logger.error("id为 " + team.getTeamId() + " 的球队[ "
					+ team.getTeamName() + " | " + team.getTeamNameEN()
					+ " ]信息没有正确入库。");

		return result;
	}

	private int saveTeamMember(Map<Byte, String> member, int teamId,
			String teamName) {
		int sum = 0;
		Set<Entry<Byte, String>> set = member.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry<Byte, String>) it.next();
			Byte number = (Byte) entry.getKey();
			String name = (String) entry.getValue();

			Integer playerId = getPlayerIdByNumber(member, number, teamName);

			int result = jdbcTemplate
					.update("insert into team_member(team_id,player_id,number) values(?,?,?)",
							new Object[] { teamId, playerId, number },
							new int[] { java.sql.Types.INTEGER,
									java.sql.Types.INTEGER,
									java.sql.Types.TINYINT });
			if (result != 1)
				logger.error("id为 " + playerId + " 的球员信息没有正确入库。");
			else
				sum += result;

		}

		return sum;
	}

	private int getPlayerIdByNumber(Map<Byte, String> member, Byte number,
			String teamName) {
		String name = member.get(number);
		return getPlayerIdByName(name, teamName);
	}

	private int getPlayerIdByName(String name, String teamName) {
		logger.info("name - "+name+" teamName - "+teamName);
		List res = jdbcTemplate
				.queryForList("select id from player where shirtname = '" + name
						+ "' and club_team='" + teamName+"'");

		if (res.size() != 1) {

			res = jdbcTemplate
					.queryForList("select id from player where shirtname = '"
							+ name + "' and national_team='" + teamName+"'");
			if (res.size() != 1)
				logger.error("存在异常球员信息: "+res.size()+"... name - "+name+" teamName - "+teamName);
		}

		return (Integer)((Map)res.get(0)).get("id");
	}

	public int saveAllTeam(List<Team> teamList) {
		int sum = 0;
		Iterator it = teamList.iterator();
		while (it.hasNext()) {
			Team team = (Team) it.next();
			sum += saveTeam(team);
		}
		return sum;
	}

	public static void main(String[] args) {
		PropertyConfigurator.configure("src/main/java/log4j.properties");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"springContext.xml");
		PesgoalDaoImpl pesgoalDaoImpl = (PesgoalDaoImpl) context
				.getBean("pesgoalDaoImpl");
		Integer id = pesgoalDaoImpl.getPlayerIdByName("Maggio", "那不勒斯");

		logger.info(id);
	}

}
