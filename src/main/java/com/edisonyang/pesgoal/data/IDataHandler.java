package com.edisonyang.pesgoal.data;

import java.util.List;

import com.edisonyang.pesgoal.data.bo.Player;
import com.edisonyang.pesgoal.data.bo.Team;

public interface IDataHandler {

	public List<Player> readPlayer() ;

	public List<Team> readTeam() ;

}
