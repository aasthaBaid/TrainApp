package com.trainapp;

import java.util.*;

/* UC14: Handle Invalid Bogie Capacity (Custom Exception)
 * @author developer
 * @version 14.0
 * 
 * */
public class Main {

	public static void main(String[] args){

		System.out.println(" --- Train Management App! ---\n");
		// trying to create a boggie for sleeper
		try {
			Bogie b1 = new Bogie("Sleeper" , 72);
			System.out.println("Created Bogie: " + b1.toString());
		} catch (InvalidCapacityException e) {
			System.out.println("Error: " + e.getMessage());
		}

		// trying to create a bogie for ac chair, with capacity 0
		try {
			Bogie b2 = new Bogie("AC chair" , 0);
			System.out.println("Created Bogie: " + b2);
		} catch (InvalidCapacityException e) {
			System.out.println("Error: " + e.getMessage());
		}



	}
}


