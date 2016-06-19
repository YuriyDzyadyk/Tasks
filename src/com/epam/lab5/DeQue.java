package com.epam.lab5;
//http://www.mycstutorials.com/articles/data_structures/queues

import java.util.LinkedList;

public class DeQue {
	
	private LinkedList<Object> list;

	public DeQue() {
		
		list = new LinkedList<Object>();
		
	}
	
	public boolean isEmpty(){
		return list.size()==0;
	}
	
	public void addLast (Object item){
		
		list.add(item);
	}
	
	public void removeLast(){
		list.remove(list.size()-1);
	}
	public Object peekLast(){
		return list.get(list.size()-1);
	}
	
	public void addFirst(Object item){
		list.addFirst(item);
		}

	
	public void removeFirst(){
		list.remove(0);
	}
	
	public Object peekFirst(){
		return list.get(0);
		
	}
	
	

}
