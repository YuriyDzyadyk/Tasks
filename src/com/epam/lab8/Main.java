package com.epam.lab8;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
				
//		MyCmd cmd = new MyCmd();
//		cmd.dirCd();
		
		Droid droid1 = new Droid();
		Droid droid2 = new Droid();
		Droid droid3 = new Droid();
		Droid droid4 = new Droid();
		Droid droid5 = new Droid();
		
		ObjectBuffer buffer = ObjectBuffer.allocate(50);
		System.out.println("Position is - " + buffer.getPosition());
		System.out.println("Limit is - " + buffer.getLimit());
		buffer.put(droid1);
		buffer.put(droid2);
		buffer.put(droid3);
		buffer.put(droid4);
		buffer.put(droid5);
		
		System.out.println(buffer.get(3));
		
		buffer.flip();
		System.out.println("Now position is - " + buffer.getPosition());
		System.out.println("Now limit is - " + buffer.getLimit());
		

	}

}
