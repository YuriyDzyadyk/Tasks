package com.epam.lab10;

import java.util.ArrayList;
import java.util.List;

public class Calc {
	
	
	
	public int add(int a, int b){
		return a+b;
		
	}
	
	public int mult(int a, int b){
		return a*b;
		
	}
	
	
	private int dev(int a, int b){
		return a/b;
		
	}
	
	public List createList(){
		List list;
				return list = new ArrayList<>();
	}
	public void addToList(List<Integer> list, int a){
		
		list.add(a);
	}
	
}
