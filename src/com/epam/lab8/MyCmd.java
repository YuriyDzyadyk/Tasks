package com.epam.lab8;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyCmd {

	public void dirCd() throws IOException {
		
		String directory = "c:";
		
		
		do{
			File file = new File(directory);
			File[] files = file.listFiles();
			if(directory.equals("exit")){
				System.exit(0);
			}else{
				for (File f : files) {
					if (f.isDirectory()) {
						System.out.print("directory:");
					} else {
						System.out.print("     file:");
					}
					System.out.println(f.getCanonicalPath());
			}
			}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please put next level, to exit write \"exit\"");
		String path = sc.nextLine();
		if(path.equals("\\")){
		directory = "c:";
		}else{
		directory = directory + "\\"+ path;
		}
		}while(true);
			
	}
	
	

}
