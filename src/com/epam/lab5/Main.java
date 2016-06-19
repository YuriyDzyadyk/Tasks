package com.epam.lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	
public static void main(String[] args) {

	
long startTime = System.currentTimeMillis();
MyArray myList = new MyArray();
myList.addString("String");
myList.addString("add");
myList.addString("Str");
myList.addString("abc");
myList.addString("i");

long endTime = System.currentTimeMillis();
System.out.println("Took "+(endTime - startTime) + " ms"); 
System.out.println();

long startTimeList = System.currentTimeMillis();
List<String> list = new ArrayList<>();
list.add("String");
list.add("add");
list.add("Str");
list.add("abc");
list.add("i");
long endTimeList = System.currentTimeMillis();
System.out.println("Took "+(endTimeList - startTimeList) + " ms"); 
//System.out.println(list.getString("add"));
//System.out.println(list.getStringByIndex(3));

	
List<Countries> countries = new ArrayList<>();
countries.add(new Countries("Ukraine", "Lviv"));
countries.add(new Countries("German", "Berlin"));
countries.add(new Countries("France", "Paris"));
countries.add(new Countries("Polend", "Warsaw"));
countries.add(new Countries("Italy", "Rome"));
//Collections.sort(countries);
Collections.sort(countries,new MyComparator());

for (Object object : countries) {
	System.out.println(object);
	}
System.out.println("Arrays");
Countries [] array = new Countries[5];
Countries italy = new Countries("Italy", "Rome");
array[0]=new Countries("Ukraine", "Lviv");
array[1]=new Countries("German", "Berlin");
array[2]=new Countries("France", "Paris");
array[3]=new Countries("Polend", "Warsaw");
array[4]=italy;

//Arrays.sort(array);
//Arrays.sort(array,new MyComparator());

for (Countries arrayCountry : array) {
	System.out.println(arrayCountry);
	
	
}
//Countries country= new Countries("Ukraine", "Lviv");
int index = Arrays.binarySearch(array,italy, new MyComparator());
System.out.println(index);

DeQue deque = new DeQue();
deque.addFirst(1);
deque.addLast(2);
deque.addFirst(0);
deque.addLast(3);

System.out.println(deque.peekFirst());
System.out.println(deque.peekLast());

deque.removeFirst();
System.out.println(deque.peekFirst());

}

}
