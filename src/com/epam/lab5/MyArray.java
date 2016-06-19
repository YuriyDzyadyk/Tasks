package com.epam.lab5;

import java.util.Arrays;

public class MyArray {

	
	int index = 10;
	String []array = new String[index];

	
	public MyArray(String[] array) {
	
		this.array = array;
	}
	
	public MyArray() {
			
	}
	
	public String getString(String param){
		for (int i = 0; i < array.length;i++) {
			if(array[i]==param){
				return array[i];
				
			}
	}
		return null;
		
		
	}
	public String getStringByIndex(int index){
		for (int i = 0; i < array.length;i++) {
			if(i==index){
				return array[i];
				
			}
	}
	
		return null;
		
		
	}
	
	public void addString(String param){
		
	for (int i = 0; ;i++) {
		if(i<index){
		if(array[i]==null){
			array[i]=param;
			System.out.println(array[i]+" "+i);
			break;
		}
		}else{
			
			index = index*3/2+1;
			String[]newArray =new String[index];
			System.arraycopy( array, 0, newArray, 0, array.length );
			array = newArray;
			System.out.println(array.length);
			if(array[i]==null){
				array[i]=param;
				System.out.println(array[i]);
				break;
			}
		}
	}
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(array);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyArray other = (MyArray) obj;
		if (!Arrays.equals(array, other.array))
			return false;
		return true;
	}
	
	
	
}
