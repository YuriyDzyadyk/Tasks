package com.epam.lab8;

public class ObjectBuffer {

	protected int capicity;
	private Object[] buf;
	protected int position = 0;
	protected int limit;
	protected static ObjectBuffer buffer;
	
	
	public ObjectBuffer(int capicity) {
		this.capicity = capicity;
		limit = capicity;
		buf = new Object[capicity];
	}
	
	

	public static ObjectBuffer wrap(Object[] buf) {
		 return buffer = new ObjectBuffer(buf.length);
			
	}

	
	
	public static ObjectBuffer allocate(int capic) {
		buffer = new ObjectBuffer(capic);
				return buffer;
	}

	public Object get() {
		for (int i = position; i < limit;)
			return buf[i++];
		return null;

	}

	public Object get(int index) {
		for (int i = 0; i < position; i++) {
			if (index == i) {
				return buf[i];
			}
		}
		return null;

	}

	public int getPosition() {
		return position;
	}



	public int getLimit() {
		return limit;
	}



	public void put(Object b) {
		if (position < limit)
			buf[position] = b;
		position++;
		
	}

	public void put(int index, Object b) {
		if (index < position)
			buf[index] = b;

	}

	public void flip() {
		limit = position;
		position = 0;

	}

}
