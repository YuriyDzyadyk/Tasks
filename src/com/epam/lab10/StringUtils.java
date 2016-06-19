package com.epam.lab10;

public class StringUtils {

	public String concatenator(String... args) {
		String myString = "";
		for (int i = 0; i < args.length; i++) {
		//	System.out.println(args.length);
//			System.out.println(i);
//			System.out.println(i + 1);
			if((i)<args.length){
			
			myString = myString + args[i];
			}
		}
		return myString;
	}
}
