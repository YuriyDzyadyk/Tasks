package com.epam.lab3;

public class Main {

	/*з мейну помилку проускалювати вище - видасть ексепшин в якому виконається close() - чому?? */ 
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//в кінці виконує оверайднутий метод close() - чому?
		try(MyAutoCloseable myAutoCloseable = new MyAutoCloseable()){
			myAutoCloseable.myMethod();
			throw new IndexOutOfBoundsException();
	
//		ловить помилку			
		}catch(Exception e){
			System.out.println("Do if Exception true");
//			
		}
		
	}

}
