package com.trainapp;

import java.util.*;
//import java.util.Scanner;
import java.util.stream.Collectors;


/* UC8: Filter Passenger Bogies Using Streams
 * @author developer
 * @version 8.0
 * 
 * */
public class Main {

	public static void main(String[] args) {

		System.out.println(" --- Train Management App! ---\n");
		List<Bogie> bogies = new ArrayList<>();
		Bogie b1 = new Bogie("Sleeper" , 72);
		Bogie b2 = new Bogie("AC Chair" , 56);
		Bogie b3 = new Bogie("First Class" , 24);
		Bogie b4 = new Bogie("General" , 90);

		bogies.add(b1);
		bogies.add(b2);
		bogies.add(b3);
		bogies.add(b4);
		System.out.println("Bogie with capacity without filtering:");
		for(Bogie b : bogies) {
			System.out.println(b.name +" -> " + b.capacity);
		}
		// filtered using stream, where capacity > 60 and again converted into list
		List<Bogie> filtered = bogies.stream()
								.filter(b -> b.capacity > 60)
								.collect(Collectors.toList());
		
		System.out.println("\nBogie with capacity with filtering using stream (capacity > 60):");
		// printing the filtered list
		for(Bogie b : filtered) {
			System.out.println(b.name +" -> " + b.capacity);
		}
		
	}	

}
