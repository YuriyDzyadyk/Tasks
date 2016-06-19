package com.epam.lab7;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class PushbeckInputStream implements Closeable {

	protected byte[] buf;
	protected int pos;
	protected InputStream is;
	
	public PushbeckInputStream(String file, int size) throws FileNotFoundException {
		is = new FileInputStream(file);
		buf = new byte[size];
		pos= size;
	}
	
	public int read() throws IOException {
		if(pos<buf.length){
			return buf[pos++];
		}else{
			return is.read();
		}
	}
		public void unread(int b) throws IOException{
			if(pos==0){
				throw new IOException("imput is full");
			}else{
				buf[--pos]=(byte)b;
			}
		}
		

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		is.close();
	}
	
	
	
	


}
