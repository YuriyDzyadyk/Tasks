package com.epam.lab5;

public class Countries implements Comparable<Countries>{

	private String Name;
	private String Capital;
	
	
	
	public Countries(String name, String capital) {
		super();
		Name = name;
		Capital = capital;
	}



	public Countries() {
			}



	@Override
	public int compareTo(Countries ComparedCountry) {
		
		int cmp = this.Name.compareTo(ComparedCountry.getName());
	if(cmp==0){
		cmp = ComparedCountry.getName().compareTo(this.Name);
	}
		
		return cmp;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getCapital() {
		return Capital;
	}



	public void setCapital(String capital) {
		Capital = capital;
	}



	@Override
	public String toString() {
		return "Countries [Name=" + Name + ", Capital=" + Capital + "]";
	}




	
	
}
