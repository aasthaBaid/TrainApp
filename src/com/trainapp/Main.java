package com.trainapp;

import java.util.*;
//import java.util.Scanner;


/* UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
 * @author developer
 * @version 5.0
 * 
 * */
public class Main {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- Train Management App! ---\n");
		// linkedHashSet maintains the insertion order and removes duplicates
		Set<String> formation = new LinkedHashSet<String>();
		formation.add("Engine");
		formation.add("Sleeper");
		formation.add("Cargo");
		formation.add("Guard");
		// attempting to duplicate a bogie
		formation.add("Sleeper");
		
		// printing the set
		System.out.println("Final Train formation:");
		System.out.println(formation);

	}

}
