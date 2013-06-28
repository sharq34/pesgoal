package com.edisonyang.pesgoal.data;

import java.util.List;

import org.apache.log4j.Logger;

import com.edisonyang.pesgoal.dao.PesgoalDaoImpl;
import com.edisonyang.pesgoal.data.bo.Player;
import com.edisonyang.pesgoal.data.bo.Team;

public class ImportData {

	private static Logger logger=Logger.getLogger(ImportData.class);
	private PesgoalDaoImpl pesgoalDaoImpl;
	IDataHandler cvsHandler = new CSVHandler("resource/");

	public void insertPlayerData() {
		
		List<Player> players = cvsHandler.readPlayer();
		
		int sum1 = pesgoalDaoImpl.saveAllPlayers(players);
		
		logger.info("数据导入完成..共导入 "+sum1+" 条球员数据。");
	}
	
	@Deprecated
	public void insertTeamData(){
		List<Team> teams = cvsHandler.readTeam();
		int sum2 = pesgoalDaoImpl.saveAllTeam(teams);
		
		logger.info("数据导入完成..共导入 "+sum2+" 条球队数据。");
	}

	public PesgoalDaoImpl getPesgoalDaoImpl() {
		return pesgoalDaoImpl;
	}

	public void setPesgoalDaoImpl(PesgoalDaoImpl pesgoalDaoImpl) {
		this.pesgoalDaoImpl = pesgoalDaoImpl;
	}

}
