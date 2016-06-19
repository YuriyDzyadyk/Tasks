package com.epam.lab7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderAndWriter {

	static int size = 1024;
	static int bufferSize1 = size / 2;
	static int bufferSize2 = size;
	static int bufferSize3 = size*8;
	static int bufferSize4 = size*16;
	static int bufferSize5 = size*32;
	static int bufferSize6 = size*size;
	static int bufferSize7 = size*size*2;
	static int[] bufferSizes = { bufferSize1, bufferSize2, bufferSize3, bufferSize4, bufferSize5, bufferSize6,
			bufferSize7 };
	
	

	public void buffReadWrite() throws IOException {

		for (int i = 0; i < bufferSizes.length; i++) {
			int element = 0;
			BufferedWriter writer = new BufferedWriter(new FileWriter("F:\\Y\\File\\epamoutputfile.txt"),
					bufferSizes[i]);
			BufferedReader reader = new BufferedReader(new FileReader("F:\\Y\\File\\epaminputfile.pdf"),
					bufferSizes[i]);
			long start = System.currentTimeMillis();
			do {
				element = reader.read();
				writer.write(element);
			} while (element != -1);
			long end = System.currentTimeMillis();
			writer.close();
			reader.close();
			long executionTime = end-start;
			System.out.println("Time for buff reading and writing for"+bufferSizes[i]+ executionTime);
		}
	}

	public void inReadWriteToFile() throws IOException {
		for (int i = 0; i < bufferSizes.length; i++) {
			int element = 0;
			Writer writerOS = new OutputStreamWriter(new FileOutputStream("F:\\Y\\File\\epaminputfile.txt"));
			Reader readerOS = new InputStreamReader(new FileInputStream("F:\\Y\\File\\epaminputfile.txt"));
			long start = System.currentTimeMillis();
			do {
				element = readerOS.read();
				writerOS.write(element);
		
			} while (element != -1);
			long end = System.currentTimeMillis();
		
			readerOS.close();
		writerOS.close();
		long executionTime = end-start;
		System.out.println("Time for reading and writing for"+bufferSizes[i]+ executionTime);
		}
		

	}
}