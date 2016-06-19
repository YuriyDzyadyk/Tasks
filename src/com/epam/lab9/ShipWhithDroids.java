package com.epam.lab9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ShipWhithDroids implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<? super Droid> ship;
	
	
	
	public ShipWhithDroids() {
		ship = new ArrayList<Droid>();
	}

	public <T extends Droid> void addDroid(T droid){
		ship.add(droid);
		
	}
	
	public <T extends Droid> void addBlasterDroid(List<? super Droid> ship, T droid){
		if(droid.isBlaster()==true)
		ship.add(droid);
		
	}
	
	public <T extends Droid> void removeDroidByName(String name){
		for (Object droid : ship) {
			if(((T) droid).getName()==name){
				ship.remove(droid);
			}else{
				System.out.println("there is no such droid");
			}
		}
		
	}
	
	public <T extends Droid> void printDroids(){
		for (Object droid : ship) {
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
			ship =  (List<? super Droid>) ois.readObject();
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
