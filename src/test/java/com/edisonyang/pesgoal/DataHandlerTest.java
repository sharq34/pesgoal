package com.edisonyang.pesgoal;

import junit.framework.TestCase;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edisonyang.pesgoal.data.ImportData;

/**
 * Unit test for simple App.
 */
public class DataHandlerTest extends TestCase {
	
	ApplicationContext context;
	
	public DataHandlerTest() {
		PropertyConfigurator.configure("src/main/java/log4j.properties");
		context =  new ClassPathXmlApplicationContext("springContext.xml");
	}

//	public void testReadPlayer() throws Exception {
//		IDataHandler test=new CSVHandler("resource/");
//		List players=test.readPlayer();
//	}
	
//	public void testReadTeam() throws Exception {
//		IDataHandler test=new CSVHandler("resource/");
//		List players=test.readTeam();
//	}
	
	public void testInsertPlayer(){
		ImportData importData=(ImportData)context.getBean("importData");
		importData.insertPlayerData();
	}
	
	
//	public void testInsertTeam(){
//		ImportData importData=(ImportData)context.getBean("importData");
//		importData.insertTeamData();
//	}
}
