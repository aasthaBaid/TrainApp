package com.trainapp;

import java.util.*;

/*  UC17: Sort Bogie Names Using Arrays.sort()
 * @author developer
 * @version 17.0
 * */
public class Main {

	public static void main(String[] args){

		System.out.println(" --- Train Management App! ---\n");
		// making a list of bogie names.
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sleeper");
		names.add("AC chair");
		names.add("First class");
		names.add("General");
		names.add("luxury");
		
		System.out.println("Bogies in original manner:" + names);
		Collections.sort(names);
		System.out.println("Bogies in sorted manner (alphabetical):" + names);

		
		
		
		
	}
}
