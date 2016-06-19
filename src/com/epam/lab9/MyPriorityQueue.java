package com.epam.lab9;

import java.util.PriorityQueue;

public class MyPriorityQueue<T> {

	private PriorityQueue<MyComparable<T>> myQueue;

	public MyPriorityQueue() {

		myQueue = new PriorityQueue<MyComparable<T>>();
	}

	public void add(int priority, T object) {

		myQueue.add(new MyComparable<T>(object, priority));

	}

	public T get() {
		return (null != myQueue.peek()) ? myQueue.poll().getObject() : null;
	}

	private static class MyComparable<T> implements Comparable<MyComparable<T>> {

		private T object;
		private int priority;

		public MyComparable(T object, int priority) {
			super();
			this.object = object;
			this.priority = priority;
		}

		@Override
		public int compareTo(MyComparable<T> anotherObject) {
			return this.priority - anotherObject.priority;
		}

		public T getObject() {
			return object;
		}

		public int getPriority() {
			return priority;
		}
	}

}
