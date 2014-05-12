package com.devil.android.wermantranslater;

public class StringTranslater {
	public static String[] special = {"nazi people", "the master" , "dirty casual" , "lady killer" , "lydiot <3" , "boom boom dance dance!" , 
		"i think not!" , "gurl please" , "nullpointerexception42 (there were 41 other ones);"};
	
	public static String[] firstSpecial = {"nazi" , "the" , "dirty" , "lady" , "lydiot" , "boom" , "i" , "gurl" , "nullpointerexception42"};
	public static String[] secondSpecial = {"people" ,"master" , "casual" , "killer" , "<3" , "boom" , "think" , "please" , "(there"};
	public static String[] thirdSpecial = {"" + "" + "" + "" + "" + "dance" + "not!" , "" , "were"};
	public static String[] forthSpecial = {"" + "" + "" + "" + "" + "dance!" + "" + "" , "were" ,};
	public static String[] fifthSpecial = {"" + "" + "" + "" + "" + "" + "" + "" + "41"};
	public static String[] sixthSpecial = {"" + "" + "" + "" + "" + "" + "" + "" + "other"};
	public static String[] seventhSpecial = {"" + "" + "" + "" + "" + "" + "" + "" + "ones);"};
	
	public static String encrpytingString(String original){
		String[] encryptedString = original.split("\\s+");
		String finalencryptedString = "";
		
		for(int k = 0; k < encryptedString.length; k++){
			finalencryptedString += Encryption.encryption(encryptedString[k]) + " ";
		}
		return finalencryptedString;
	}
	
	public static String decryptString(String encrypted){
		String[] decryptString = encrypted.split("\\s+");
		String finaldecryptedString = "";
		String imspecial = "";
		String gettingthere = "";
		int start = 0;
		int end = 0;
		for(int f = 0; f < decryptString.length; f++){
			finaldecryptedString += Encryption.decryption(decryptString[f]) + " ";
		}
		if(finaldecryptedString.contains("nazi people")){
			start = finaldecryptedString.indexOf("nazi people");
			end = finaldecryptedString.lastIndexOf("nazi people");
			imspecial = finaldecryptedString.substring(start , end + 11);
			finaldecryptedString = finaldecryptedString.replace(imspecial, "Robotics");
		}
		if(finaldecryptedString.contains("the master")){
			start = finaldecryptedString.indexOf("the master");
			end = finaldecryptedString.lastIndexOf("the master");
			imspecial = finaldecryptedString.substring(start , end + 10);
			finaldecryptedString = finaldecryptedString.replace(imspecial, "Griffen");
		}
		if(finaldecryptedString.contains("dirty casual")){
			start = finaldecryptedString.indexOf("dirty casual");
			end = finaldecryptedString.lastIndexOf("dirty casual");
			imspecial = finaldecryptedString.substring(start , end + 12);
			finaldecryptedString = finaldecryptedString.replace(imspecial, "Harrison");
		}
		if(finaldecryptedString.contains("lady killer")){
			start = finaldecryptedString.indexOf("lady killer");
			end = finaldecryptedString.lastIndexOf("lady killer");
			imspecial = finaldecryptedString.substring(start , end + 11);
			finaldecryptedString = finaldecryptedString.replace(imspecial, "Logan");
		}
		if(finaldecryptedString.contains("lydiot <3")){
			start = finaldecryptedString.indexOf("lydiot <3");
			end = finaldecryptedString.lastIndexOf("lydiot <3");
			imspecial = finaldecryptedString.substring(start , end + 9);
			finaldecryptedString = finaldecryptedString.replace(imspecial, "Lydia");
		}
		if(finaldecryptedString.contains("boom boom dance dance!")){
			start = finaldecryptedString.indexOf("boom boom dance dance!");
			end = finaldecryptedString.lastIndexOf("boom boom dance dance!");
			imspecial = finaldecryptedString.substring(start , end + 22);
			finaldecryptedString = finaldecryptedString.replace(imspecial, "Dance_mode");
		}
		if(finaldecryptedString.contains("i think not!")){
			start = finaldecryptedString.indexOf("i think not!");
			end = finaldecryptedString.lastIndexOf("i think not!");
			imspecial = finaldecryptedString.substring(start , end + 12);
			finaldecryptedString = finaldecryptedString.replace(imspecial, "System.exit");
		}
		if(finaldecryptedString.contains("gurl please")){
			start = finaldecryptedString.indexOf("gurl please");
			end = finaldecryptedString.lastIndexOf("gurl please");
			imspecial = finaldecryptedString.substring(start , end + 11);
			finaldecryptedString = finaldecryptedString.replace(imspecial, "M");
		}
		if(finaldecryptedString.contains("nullpointerexception42 (there were 41 other ones);")){
			start = finaldecryptedString.indexOf("nullpointerexception42 (there were 41 other ones);");
			end = finaldecryptedString.lastIndexOf("nullpointerexception42 (there were 41 other ones);");
			imspecial = finaldecryptedString.substring(start , end + 50);
			finaldecryptedString = finaldecryptedString.replace(imspecial, "1");
		}

		

//		for(int j = 0; j < special.length; j++){
//			if(finaldecryptedString.contains(special[j])){
//				start = finaldecryptedString.indexOf(special[j]);
//				end = finaldecryptedString.lastIndexOf(special[j]);  
//				imspecial = finaldecryptedString.substring(start , end);
//				gettingthere = Encryption.decryption(imspecial);
//				finaldecryptedString = finaldecryptedString.replace(imspecial, gettingthere); //might not work 
//			}
//		}
//		String done = "";
//		for(int i = 0; i < decryptString.length; i++){
//			if(decryptString[i].equalsIgnoreCase(firstSpecial[i])){
//				if(decryptString[i+1].equalsIgnoreCase(secondSpecial[i])){
//					done = firstSpecial[i] + "" + secondSpecial[i];
//					if(done.equalsIgnoreCase(special[i])){
//						imspecial = Encryption.decryption(done);
//						finaldecryptedString = finaldecryptedString.replace(done, imspecial);
//					}
//					if(decryptString[i+2].equalsIgnoreCase(thirdSpecial[i])){
//						done = firstSpecial[i] + "" + secondSpecial[i] + "" + thirdSpecial[i];
//						if(done.equalsIgnoreCase(special[i])){
//							imspecial = Encryption.decryption(done);
//							finaldecryptedString = finaldecryptedString.replace(done, imspecial);
//						}
//						if(decryptString[i+3].equalsIgnoreCase(forthSpecial[i])){
//							done = firstSpecial[i] + "" + secondSpecial[i] + "" + thirdSpecial[i] + "" + forthSpecial[i];
//							if(done.equalsIgnoreCase(special[i])){
//								imspecial = Encryption.decryption(done);
//								finaldecryptedString = finaldecryptedString.replace(done, imspecial);
//							}
//							if(decryptString[i+4].equalsIgnoreCase(fifthSpecial[i])){
//								done = firstSpecial[i] + "" + secondSpecial[i] + "" + thirdSpecial[i] + "" + forthSpecial[i] + "" + fifthSpecial[i];
//								if(done.equalsIgnoreCase(special[i])){
//									imspecial = Encryption.decryption(done);
//									finaldecryptedString = finaldecryptedString.replace(done, imspecial);
//								}
//								if(decryptString[i+5].equalsIgnoreCase(sixthSpecial[i])){
//									done = firstSpecial[i] + "" + secondSpecial[i] + "" + thirdSpecial[i] + "" + forthSpecial[i] + "" + fifthSpecial[i] + "" + sixthSpecial[i];
//									if(done.equalsIgnoreCase(special[i])){
//										imspecial = Encryption.decryption(done);
//										finaldecryptedString = finaldecryptedString.replace(done, imspecial);
//									}
//									if(decryptString[i+5].equalsIgnoreCase(seventhSpecial[i])){
//										done = firstSpecial[i] + "" + secondSpecial[i] + "" + thirdSpecial[i] + "" + forthSpecial[i] + "" + fifthSpecial[i] + "" + sixthSpecial[i] + "" + seventhSpecial[i];
//										if(done.equalsIgnoreCase(special[i])){
//											imspecial = Encryption.decryption(done);
//											finaldecryptedString = finaldecryptedString.replace(done, imspecial);
//										}
//										
//									}
//									
//								}
//								
//							}                                            	// out of bounds exception
//							
//						}
//					
//					}
//				}
//			}
//		}

		return finaldecryptedString;
	}

}
