package com.trainapp;

public class Bogie {
	String type;
	int capacity;
	public Bogie(String type, int capacity) throws InvalidCapacityException{
		if(capacity <= 0) {
			throw new InvalidCapacityException("Capacity should be greater than 0");
		}
		this.type = type;
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Bogie [type=" + type + ", capacity=" + capacity + "]";
	}	
	
	
}
