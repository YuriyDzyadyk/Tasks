package com.epam.lab3;

public class Main {

	/*� ����� ������� ������������� ���� - ������� �������� � ����� ���������� close() - ����?? */ 
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//� ���� ������ ������������ ����� close() - ����?
		try(MyAutoCloseable myAutoCloseable = new MyAutoCloseable()){
			myAutoCloseable.myMethod();
			throw new IndexOutOfBoundsException();
	
//		������ �������			
		}catch(Exception e){
			System.out.println("Do if Exception true");
//			
		}
		
	}

}
