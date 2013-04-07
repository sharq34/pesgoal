package com.edisonyang.pesgoal.data;

import java.io.IOException;
import java.util.List;

import com.edisonyang.pesgoal.data.bo.Player;
import com.edisonyang.pesgoal.data.bo.Team;

public interface IDataHandler {

	public List<Player> readPlayer() throws IOException;

	public List<Team> readTeam() throws IOException;

}
