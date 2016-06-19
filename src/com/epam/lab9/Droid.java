package com.epam.lab9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class Droid implements Serializable{
	private String name="Droid";
	private int helthLevel;
	private transient int shotPower;
	private transient int blasterReloading = 1;
	private transient int rocketReloading = 0;
	private transient int aidKit = 0;
	private transient int shield;
	private boolean isAidKit;
	private boolean isBlaster;
	private boolean isRoket;
	

	



	



	public Droid(String name, int helthLevel) {
		super();
		this.name = name;
		this.helthLevel = helthLevel;
	}





	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getHelthLevel() {
		return helthLevel;
	}



	public void setHelthLevel(int helthLevel) {
		this.helthLevel = helthLevel;
	}



	public int getShotPower() {
		return shotPower;
	}



	public void setShotPower(int shotPower) {
		this.shotPower = shotPower;
	}



	public int getBlasterReloading() {
		return blasterReloading;
	}



	public void setBlasterReloading(int blasterReloading) {
		this.blasterReloading = blasterReloading;
	}



	public int getRocketReloading() {
		return rocketReloading;
	}



	public void setRocketReloading(int rocketReloading) {
		this.rocketReloading = rocketReloading;
	}



	public int getAidKit() {
		return aidKit;
	}



	public void setAidKit(int aidKit) {
		this.aidKit = aidKit;
	}



	public int getShield() {
		return shield;
	}



	public void setShield(int shield) {
		this.shield = shield;
	}



	public boolean isAidKit() {
		return isAidKit;
	}



	public void setAidKit(boolean isAidKit) {
		this.isAidKit = isAidKit;
	}



	public boolean isBlaster() {
		return isBlaster;
	}



	public void setBlaster(boolean isBlaster) {
		this.isBlaster = isBlaster;
	}



	public boolean isRoket() {
		return isRoket;
	}



	public void setRoket(boolean isRoket) {
		this.isRoket = isRoket;
	}



	@Override
	public String toString() {
		return "Droid [name=" + name + ", helthLevel=" + helthLevel + ", isAidKit=" + isAidKit + ", isBlaster="
				+ isBlaster + ", isRoket=" + isRoket + "]";
	}




}

	