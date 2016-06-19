package com.epam.lab10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAndRxMetods {

	public void sentenceRx(String content) {
		//"((?<=. [A-Z])good)|((?<=.[A-Z] )bad)|((?<=. [a-z] )bad)";
		
		String commentsRx = "(\\.(?=[A-Z])..|\\.(?=[a-z])..|\\.(?= [a-z])..)";
		Pattern pattern = Pattern.compile(commentsRx);
		Matcher matcher = pattern.matcher(content);
		
		while(matcher.find()){
			
			System.out.println("Wrong, please correct spelling "+matcher.group());
		}
//		if(content.matches("(.*). [A-Z](.*)")){
//			System.out.println("good");
//			
//		}
//		if(content.matches("(.*).[A-Z](.*)")){
//			System.out.println(".[A-Z]"+" bed");
//		//		}
//		if(content.matches("(.*).[a-z](.*)")){
//			System.out.println(".[a-z]"+" beeed");
//		//		}
//		if(content.matches("(.*). [a-z](.*)")){
//			System.out.println(". [a-z]"+" baaaad");
//		}

		}


	public String[] splitingRX(String content) {
	//	myString.split("(?<=[,.])|(?=[,.])|\\s+");
	//	return content.split("you|the"); //delete you & the
		
		return  content.split("(?=\\b[you|the])");
	}

	public String vowelsRx(String content) {
		System.out.println(content);
		String newContent = content.replaceAll("[aeiouy]\\B", "_");
System.out.println(newContent);
//		String newContent ="";
//		for (char vowel : content.toCharArray()) {
//			if(vowel=='a'|| vowel=='i'||vowel=='o'||vowel=='u'||vowel=='e'||vowel=='y'){
//				vowel='_';
//				newContent=newContent+vowel;
//			}else{
//				newContent=newContent+vowel;
//			}
//		}
		
		return newContent;
	}
}
