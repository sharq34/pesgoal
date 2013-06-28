package com.edisonyang.pesgoal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ChouQian {

	String ftPath = "D:\\workspace\\pesgoal\\src\\test\\java\\com\\edisonyang\\pesgoal\\team1.txt";
	String jtPath = "D:\\workspace\\pesgoal\\src\\test\\java\\com\\edisonyang\\pesgoal\\team2.txt";

	List<String> f = new ArrayList<String>(16);
	List<String> j = new ArrayList<String>(16);

	Map<Integer, String> result = new HashMap<Integer, String>();

	public ChouQian() throws IOException {

		FileReader fr = new FileReader(new File(ftPath));
		BufferedReader br = new BufferedReader(fr);
		String fteam = br.readLine();

		while (fteam != null) {
			f.add(fteam);
			fteam = br.readLine();
		}

		fr = new FileReader(new File(jtPath));
		br = new BufferedReader(fr);
		String jteam = br.readLine();

		while (jteam != null) {
			j.add(jteam);
			jteam = br.readLine();
		}

		br.close();
		fr.close();

	}

	private void assign() {

		for (int i = 0; i < 32; i++) {
			if (i % 2 == 0) {
				String t = getTeam(true, f);
				result.put(i, t);
			} else {
				Boolean flag = true;
				String value = result.get(Integer.valueOf(i - 1));
				if (value.indexOf("轮空") != -1) {
					flag = false;
				}
				String t = getTeam(flag, j);
				result.put(i, t);
			}
		}
	}

	private String getTeam(Boolean nullable, List<String> team) {

		Random rand = new Random();
		int size = team.size();
		int index = rand.nextInt(size);
		String t = team.get(index);
		if (nullable == false) {
			while (t.indexOf("轮空") != -1) {
				if(team.size()==1){
					System.out.println("抽签最后2个对手都为轮空，抽签程序退出！");
					System.exit(-1);
				}
				index = rand.nextInt(size);
				t = team.get(index);
			}
		}

		return team.remove(index);
	}

	public static void main(String[] args) throws Exception {
		ChouQian cq=new ChouQian();
		cq.assign();
		cq.printf();
	}

	public void printf() {
		
		printEveryChar("首先特别感谢本次杯赛的赞助小畅鱼和lulu \n");
		printEveryChar("在抽签开始前，先喊一下我们的口号： \n");
		printEveryChar("法克鱿满脸... \n");
		printEveryChar("法克鱿马静... \n");
		printEveryChar("好吧可以开始抽了... \n");
		printEveryChar("第一届JF联合会杯抽签程序即将启动......\n");

		printEveryChar("\n上半区对阵情况依次为...\n");
		
		for (int i = 0; i < 16; i++) {
			String team = result.get(Integer.valueOf(i));
			if (i % 2 == 0) {
				printEveryChar(team);
				printEveryChar(" vs ");
			} else {
				printEveryChar(team + "\n");
			}
		}
		
		printEveryChar("\n下半区对阵情况依次为...\n\n");
		
		for (int i = 16; i < 32; i++) {
			String team = result.get(Integer.valueOf(i));
			if (i % 2 == 0) {
				printEveryChar(team);
				printEveryChar(" vs ");
			} else {
				printEveryChar(team + "\n");
			}
		}
	}
	
	private void printEveryChar(String str){
		char[] chars=str.toCharArray();
		for(char c:chars){
			try {
				Thread.sleep(120L);
				System.out.print(c);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
