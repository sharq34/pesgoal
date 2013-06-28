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
		
		logger.info("���ݵ������..������ "+sum1+" ����Ա���ݡ�");
	}
	
	@Deprecated
	public void insertTeamData(){
		List<Team> teams = cvsHandler.readTeam();
		int sum2 = pesgoalDaoImpl.saveAllTeam(teams);
		
		logger.info("���ݵ������..������ "+sum2+" ��������ݡ�");
	}

	public PesgoalDaoImpl getPesgoalDaoImpl() {
		return pesgoalDaoImpl;
	}

	public void setPesgoalDaoImpl(PesgoalDaoImpl pesgoalDaoImpl) {
		this.pesgoalDaoImpl = pesgoalDaoImpl;
	}

}
