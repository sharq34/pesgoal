package com.edisonyang.pesgoal;

import java.util.List;

import junit.framework.TestCase;

import org.apache.log4j.PropertyConfigurator;

import com.edisonyang.pesgoal.data.CSVHandler;
import com.edisonyang.pesgoal.data.IDataHandler;

/**
 * Unit test for simple App.
 */
public class DataLoaderTest extends TestCase {
	
	public DataLoaderTest(String testName) {
		super(testName);
		PropertyConfigurator.configure("src/main/java/log4j.properties");
	}

//	public void testReadPlayer() throws Exception {
//		IDataHandler test=new CSVHandler("resource/");
//		List players=test.readPlayer();
//	}
	
	public void testReadTeam() throws Exception {
		IDataHandler test=new CSVHandler("resource/");
		List players=test.readTeam();
	}
}
