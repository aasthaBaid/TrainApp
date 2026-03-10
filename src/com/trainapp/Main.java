package com.trainapp;

import java.util.*;
//import java.util.Scanner;


/* UC7: Sort Bogies by Capacity (Comparator)
 * @author developer
 * @version 7.0
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
		System.out.println("Bogie with capacity without sorting:");
		for(Bogie b : bogies) {
			System.out.println(b.name +" -> " + b.capacity);
		}
		// sorted in ascending order based on capacity
		System.out.println("\nBogie with capacity after sorting (asc order):");
		Comparator<Bogie> nameComparator = Comparator.comparing(b -> b.capacity);
		Collections.sort(bogies, nameComparator);
		for(Bogie b : bogies) {
			System.out.println(b.name +" -> " + b.capacity);
		}
		// sorted in descending order base don capacity
		System.out.println("\nBogie with capacity after sorting (desc order):");
		Collections.sort(bogies, nameComparator.reversed());
		for(Bogie b : bogies) {
			System.out.println(b.name +" -> " + b.capacity);
		}
	}	

}
