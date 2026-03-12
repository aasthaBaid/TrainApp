package com.trainapp;

import java.util.*;

/*  UC18: Linear Search for Bogie ID (Array-Based Searching)
 * @author developer
 * @version 18.0
 * */
public class Main {

	public static void main(String[] args){

		System.out.println(" --- Train Management App! ---\n");
		// making a list of bogie names.
		String[] bogieIds = {"BG101", "BG209" , "BG307" , "BG455" , "BG788"};
		String searchId = "BG455";
		System.out.println("Bogie ids:");
		for(String id : bogieIds) {
			System.out.print(id + " ");
		}
		System.out.println();
		boolean found = false;
		// doing a linear search to find the bogie id
		for(String id : bogieIds) {
			if(id == searchId) {
				found = true;
				break;
			}
		}
		// if the bogie id is found, then prints found
		if(found) {
			System.out.println(searchId + " Found in train consist");
		}
		else System.out.println(searchId + " Not found in train consit");
	}
}
