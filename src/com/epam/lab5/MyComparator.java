package com.epam.lab5;

import java.util.Comparator;

public class MyComparator implements Comparator<Countries> {
	
	public int compare(Countries country1, Countries country2){
		
		String cCapital1 = country1.getCapital().toUpperCase();
		String cCapita2 = country2.getCapital().toUpperCase();
		
		return cCapital1.compareTo(cCapita2);
	}

}
