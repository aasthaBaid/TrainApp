package com.trainapp;

import java.util.*;
import java.util.Map.Entry;
//import java.util.Scanner;
import java.util.stream.Collectors;


/* UC9: Group Bogies by Type (Collectors.groupingBy)
 * @author developer
 * @version 10.0
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
		// printing bogies with its capacity
		System.out.println("Bogie with capacity:");
		for(Bogie b : bogies) {
			System.out.println(b.name +" -> " + b.capacity);
		}
		// calculating the total capacity of the train.
		int totalCapacity = 0;
		for(Bogie b : bogies) {
			totalCapacity += b.capacity;
		}
		System.out.println("Total Capacity in train including all bogies:" + totalCapacity);
		
	}	

}
