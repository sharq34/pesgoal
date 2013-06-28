package com.edisonyang.pesgoal;

import junit.framework.TestCase;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edisonyang.pesgoal.dao.PesgoalDaoImpl;
import com.edisonyang.pesgoal.data.bo.Speed;

public class DAOTest extends TestCase {
	ApplicationContext context;
	
	public DAOTest() {
		PropertyConfigurator.configure("src/main/java/log4j.properties");
		context =  new ClassPathXmlApplicationContext("springContext.xml");
	}
	
	public void testSave(){
//		PesgoalDaoImpl dao=(PesgoalDaoImpl)context.getBean("pesgoalDaoImpl");
//		dao.setDataSource();
//		Speed sp=new Speed();
//		sp.setDribbleSpeed((byte)2);
//		sp.setExplosivePower((byte)3);
//		sp.setResponse((byte)4);
//		sp.setTopSpeed((byte)5);
//		dao.save(sp);
	}
}
