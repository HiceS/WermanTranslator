package com.devil.android.wermantranslater;

import java.util.Random;

public class Encryption {
	
	public static String[] special = {"nazi people", "the master" , "dirty casual" , "lady killer" , "lydiot <3" , "boom boom dance dance!" , 
		"i think not!" , "gurl please" , "nullpointerexception42 (there were 41 other ones);"};

	
	public static String[] con = {"ConMan","Khan","Con Con The Wang!","Con Con","Conneh","Con","Khaaaaaaaann","ShiCON","EmotiCON"};
	
	public static String[] english = {"kkk", "robotics" , "griffen" , "shawn" , "girl" , "girls" , "food" , "drink" , "harrison" ,
		"seth" , "logan" , "lydia" , "jackson" , "dance_mode" , "system.exit" , "carly" , "carlo" , "is" , "er" , "g" ,
		"b" , "m" , "s" , "v" , "1" , "2" , "3" , "5" , "6" , "7" , "69" , "pro"};
	
	public static String[] werman = {"Robotics" ,"nazi people" , "the master" , "jackson" , "curvy" , "bjerg" , "mcLovin" , "pepsi" ,
		"dirty casual" , "flaminaFace" , "lady killer" , "lydiot <3" , "shawnish" , "boom boom dance dance!" , "i think not!" , "carlo" ,
		"carlos" , "isn't" , "ei" , "w" , "vladimir" , "gurl please" , "lanaster" , "flairbrother" , "nullpointerexception42 (there were 41 other ones);" ,
		"3" , "2" , "80" , "42" , "11" , "439" , "con"};
	
	public static String specialSolver(String unSolved){
		String solved = "";
		return solved;
	}
	
	public static String conRDM(){
		int idx = new Random().nextInt(con.length);
		String random = (con[idx]);
		return random;
	}
	
	public static String encryption (String x){
		x = x.toLowerCase();
		String conMan = "Connie";
		int z = 0;
		for(int l = 0; l < english.length; l++){
			if(x.equalsIgnoreCase(english[l])){
				x = x.replace(english[l], werman[l]);
			}
			do {
				for(int s = 0; s < con.length; s++){
					if(x.equalsIgnoreCase(conMan)){
						x = x.replace(x, conRDM());
					}
				}
				z++;
			}while(z < con.length);
		}
		return x;
	}
	
	public static String decryption(String y){
		y = y.toLowerCase();
		int mn = 0;
		String conMan = "Connie";
		String refined = "";
			for(int a = 0; a < werman.length; a++){
//				if(y.contains(special[a])){	
//					refined += y + "";
//					if(refined.equalsIgnoreCase(special[a])){   // RETURN AND FIX FOR SPECIAL
//						y = y.replace(special[a] , refined);
//					}
//				}
				if(y.equalsIgnoreCase(werman[a])){
					y = y.replace(werman[a] , english[a]);
				}
				do {
					for(int g = 0; g < con.length; g++){
						if(y.equalsIgnoreCase(con[g])){
							if(y.equalsIgnoreCase("con")){
								y += " or pro";
							}
							String amaz = con[g].toLowerCase();
							y = y.replace(amaz, conMan);
						}
					}
					mn++;
				}while(mn < con.length);		
			}
		return y;
	}

}
