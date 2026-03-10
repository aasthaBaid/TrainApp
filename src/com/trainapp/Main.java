package com.trainapp;

import java.util.*;
//import java.util.Scanner;


/* UC6 Map Bogie to Capacity (HashMap)
 * @author developer
 * @version 6.0
 * 
 * */
public class Main {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- Train Management App! ---\n");
		// using HashMap to put {bogie name , capacity}
		Map<String, Integer> capacityMap = new HashMap<String, Integer>();
		capacityMap.put("First Class", 24);
		capacityMap.put("Sleeper", 72);
		capacityMap.put("Cargo", 120);
		capacityMap.put("AC Chair", 56);
		
		// using entrset() to iterate over the map
		System.out.println("Bogie Capacity Details:");
		for(Map.Entry<String, Integer> map : capacityMap.entrySet()) {
			System.out.println(map.getKey() + " -> " + map.getValue());
		}
	}

}
