package com.edisonyang.pesgoal;

import java.io.IOException;
import java.util.List;

import junit.framework.TestCase;

import com.edisonyang.pesgoal.data.CSVHandler;
import com.edisonyang.pesgoal.data.IDataHandler;

/**
 * Unit test for simple App.
 */
public class PlayerLoaderTest extends TestCase {

	public PlayerLoaderTest(String testName) {
		super(testName);
	}

	public void testApp() throws Exception {
		IDataHandler test=new CSVHandler("D:\\resouce\\pes\\res\\");
		List players=test.readPlayer();
	}
}
