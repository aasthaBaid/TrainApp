package com.trainapp;

import java.util.*;
import java.util.Map.Entry;
//import java.util.Scanner;
import java.util.stream.Collectors;


/* UC9: Group Bogies by Type (Collectors.groupingBy)
 * @author developer
 * @version 9.0
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
		Bogie b5 = new Bogie("First Class" , 60);
		Bogie b6 = new Bogie("Sleeper" , 70);

		bogies.add(b1);
		bogies.add(b2);
		bogies.add(b3);
		bogies.add(b4);
		bogies.add(b5);
		bogies.add(b6);
		System.out.println("Bogie with capacity without filtering:");
		for(Bogie b : bogies) {
			System.out.println(b.name +" -> " + b.capacity);
		}
		// grouping the list, using stream and groupedBy function in collectors and storing it in a map
		Map<String,List<Bogie>> groupedBogies = bogies.stream()
								.collect(Collectors.groupingBy(b -> b.name));
		
		System.out.println("\nGrouping the list using bogie names:");
		// printing the grouped map
		for(Map.Entry<String, List<Bogie>> map : groupedBogies.entrySet()) {
			System.out.println("\nBogie: "+ map.getKey());
			for(Bogie b : map.getValue()) {
				System.out.println("[" + b.name + " -> " + b.capacity + "]");
			}
			
		}
		
	}	

}
