package com.epam.lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainComentsReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	System.out.println("Please write file name");
	Scanner sc = new Scanner(System.in);
	String file = sc.nextLine();
	
	FileInputStream fs = new FileInputStream(file+".java");
	int size = fs.available();
	byte b[] = new byte[size];
	fs.read(b);
	String content = new String(b);
	
	String commentsRx = "(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)";
	Pattern pattern = Pattern.compile(commentsRx);
	Matcher matcher = pattern.matcher(content);
	
	while(matcher.find()){
		System.out.println(matcher.group());
	}
	
	}

}
