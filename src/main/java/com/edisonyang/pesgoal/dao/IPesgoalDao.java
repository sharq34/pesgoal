package com.edisonyang.pesgoal.dao;

import java.util.List;

import com.edisonyang.pesgoal.data.bo.Player;
import com.edisonyang.pesgoal.data.bo.Team;

public interface IPesgoalDao {
	public int savePlayer(Player player);
	public int saveAllPlayers(List<Player> playerList);
	public int saveTeam(Team team);
	public int saveAllTeam(List<Team> teamList);
	public void delete();
}
