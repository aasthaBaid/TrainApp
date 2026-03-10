package com.trainapp;

import java.util.*;
import java.util.Scanner;


/* UC3: Track Unique Bogie IDs (Set – HashSet)
 * @author developer
 * @version 3.0
 * 
 * */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- Train Management App! ---\n");
		// creating a hashset to avoid duplicate entries of the bogies
		HashSet<String> bogies = new HashSet<String>();
		bogies.add("BG101");
		bogies.add("BG102");
		bogies.add("BG103");
		bogies.add("BG104");
		bogies.add("BG102");
		bogies.add("BG105");
		// printing the bogies
		// prints all the bogies in the hashset, removing duplicates.
		System.out.println("Bogie ID's: " + bogies);
		System.out.println("Using HashSet, ignored the duplicates added.");
	}

}
