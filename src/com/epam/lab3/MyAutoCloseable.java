package com.epam.lab3;

public class MyAutoCloseable implements AutoCloseable  {

	public void myMethod(){
		System.out.println("Method in My Closeable");
		
	}
	
	
	@Override
	public void close() throws Exception /*���� ��������� ������� ������� �� �� "�����"(��� � ����)*/ {
		System.out.println("Close inplementation in myAutoCloseable");
		Exception e = new Exception();
				   throw e;
		
	}
	
	
	

}
