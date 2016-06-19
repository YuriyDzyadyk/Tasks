package com.epam.lab9;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {


		ShipWhithDroids ship = new ShipWhithDroids();
		
		
		Droid droid1 = new Droid("1",400);
		Droid droid2 = new Droid("2",200);
		Droid droid3 = new Droid("3",300);
		Droid droid4 = new Droid("4",100);
		Droid droid5 = new Droid("5",500);
		
//		ship.addDroid(droid1);
//		ship.addDroid(droid2);
//		ship.addDroid(droid3);
//		ship.addDroid(droid4);
//		ship.addDroid(droid5);
//	//	ship.removeDroidByName("4");
//		
//		ship.writeDroid();
//		ShipWhithDroids newShip = new ShipWhithDroids();
//		newShip.readDroid();
//		
//		newShip.printDroids();
//		
		
	
		MyPriorityQueue<Droid> myPrQ = new MyPriorityQueue<>();
		myPrQ.add(droid1.getHelthLevel(), droid1);
		myPrQ.add(droid2.getHelthLevel(), droid2);
		myPrQ.add(droid3.getHelthLevel(), droid3);
		myPrQ.add(droid4.getHelthLevel(), droid4);
		myPrQ.add(droid5.getHelthLevel(), droid5);
		
		System.out.println(myPrQ.get().toString());
	}
	
	

}
