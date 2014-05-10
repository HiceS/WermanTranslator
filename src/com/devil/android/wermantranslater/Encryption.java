package com.devil.android.wermantranslater;

import java.util.Random;

public class Encryption {
	public static String[] con = {"ConMan","Khan","Con Con The Wang!","Con Con","Conneh","Con","Khaaaaaaaann","ShiCON","EmotiCON"};
	
	public static String conRDM(){
		int idx = new Random().nextInt(con.length);
		String random = (con[idx]);
		return random;
	}
	
	public static String encryption (String x){
		x.toLowerCase();
		int xchange = 0;
		do{
			x = x.replace("kkk","Robotics");
			xchange++;
			x = x.replace("robotics","nazi people");
			xchange++;
			x = x.replace("griffen","The Master");
			xchange++;
			x = x.replace("shawn","jackson");
			xchange++;
			x = x.replace("girl","curvy");
			xchange++;
			x = x.replace("girls","bjerg");
			xchange++;
			x = x.replace("food","McLovin");
			xchange++;
			x = x.replace("drink","pepsi");
			xchange++;
			x = x.replace("harrison","dirty casual");
			xchange++;
			x = x.replace("seth","flaminaFace");
			xchange++;
			x = x.replace("Connie", Encryption.conRDM());
			xchange++;
			x = x.replace("logan","lady killer");
			xchange++;
			x = x.replace("lydia","lydiot <3");
			xchange++;
			x = x.replace("jackson","Shawnish");
			xchange++;
			x = x.replace("dance_mode","Boom Boom dance dance!");
			xchange++;
			x = x.replace("system.exit","I think not!");
			xchange++;
			x = x.replace("carly","Carlo");
			xchange++;
			x = x.replace("carlo","Carlos");
			xchange++;
			x = x.replace("is","isn't");
			xchange++;
			x = x.replace("er","ei");
			xchange++;
			x = x.replace("g","W");
			xchange++;
			x = x.replace("b","Vladimir");
			xchange++;
			x = x.replace("m","gurl please");
			xchange++;
			x = x.replace("s","Lanaster");
			xchange++;
			x = x.replace("v","FLAIRBROTHER");
			xchange++;
			x = x.replace("1","nullpointerexception42");
			xchange++;
			x = x.replace("2","3");
			xchange++;
			x = x.replace("3","2");
			xchange++;
			x = x.replace("5","80");
			xchange++;
			x = x.replace("6","42");
			xchange++;
			x = x.replace("7","11");
			xchange++;
			x = x.replace("69","439");
			xchange++;
		}while(xchange <= 1);
		return x;
	}
	public static String decryption(String y){
		y.toLowerCase();
		int ychange = 0;
		do{
			for(int j = 0; j <= con.length; j++){
				if(y.equals(con[j])){
					ychange++;
				}
			}
			y = y.replace("robotics","KKK");
			ychange++;
			y = y.replace("nazi people","Robotics");
			ychange++;
			y = y.replace("the master","Griffen");
			ychange++;
			y = y.replace("jackson","Shawn");
			ychange++;
			y = y.replace("curvy","girl");
			ychange++;
			y = y.replace("bjerg","girls");
			ychange++;
			y = y.replace("mclovin'","food");
			ychange++;
			y = y.replace("pepsi","drink");
			ychange++;
			y = y.replace("dirty casual","Harrison");
			ychange++;
			y = y.replace("flaminaface","Seth");
			ychange++;
			y = y.replace("lady killer","Logan");
			ychange++;
			y = y.replace("lydiot <3","Lydia");
			ychange++;
			y = y.replace("shawnish","Jackson");
			ychange++;
			y = y.replace("boom boom dance dance!","Dance_Mode");
			ychange++;
			y = y.replace("i think not!","System.exit");
			ychange++;
			y = y.replace("carlo","Carly");
			ychange++;
			y = y.replace("carlos","Carlo");
			ychange++;
			y = y.replace("isn't","is");
			ychange++;
			y = y.replace("ei","er");
			ychange++;
			y = y.replace("w","g");
			ychange++;
			y = y.replace("vladimir","b");
			ychange++;
			y = y.replace("gurl please","m");
			ychange++;
			y = y.replace("lanaster","s");
			ychange++;
			y = y.replace("flairbrother","v");
			ychange++;
			y = y.replace("nullpointerexception42 (there were 41 other ones);","1");
			ychange++;
			y = y.replace("3","2");
			ychange++;
			y = y.replace("2","3");
			ychange++;
			y = y.replace("80","5");
			ychange++;
			y = y.replace("42","6");
			ychange++;
			y = y.replace("11","7");
			ychange++;
			y = y.replace("439","69");
			ychange++;
		}while(ychange <= 1);
		return y;
	}

}
