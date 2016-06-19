package com.epam.lab7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ShipWhithDroids implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Droid> ship;
	
	
	
	public ShipWhithDroids() {
		ship = new ArrayList<Droid>();
	}

	public void addDroid(Droid droid){
		ship.add(droid);
		
	}
	
	public void addBlasterDroid(Droid droid){
		if(droid.isBlaster()==true)
		ship.add(droid);
		
	}
	
	public void removeDroidByName(String name){
		for (Droid droid : ship) {
			if(droid.getName()==name){
				ship.remove(droid);
			}else{
				System.out.println("there is no such droid");
			}
		}
		
	}
	
	public void printDroids(){
		for (Droid droid : ship) {
			System.out.println(droid);
		}
		
	}
	
	public void writeDroid(){
		try{
			FileOutputStream fos = new FileOutputStream("c:\\Users\\Lenovo\\Desktop\\Java\\File\\epamfile.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ship);
			oos.close();
	        fos.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}

		
	}
	public void readDroid(){
		
		try{
			FileInputStream fis = new FileInputStream("c:\\Users\\Lenovo\\Desktop\\Java\\File\\epamfile.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ship =  (List<Droid>) ois.readObject();
			ois.close();
	        fis.close();
			
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			// TODO Auto-generated catch block
			cnfe.printStackTrace();
		}
		
	}
		
	
	
}
