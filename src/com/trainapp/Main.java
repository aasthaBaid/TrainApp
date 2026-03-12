package com.trainapp;

import java.util.*;

/* UC19: Binary Search for Bogie ID (Optimized Searching)
 * @author developer
 * @version 19.0
 * */
public class Main {

	public static void main(String[] args){

		System.out.println(" --- Train Management App! ---\n");
		// making a list of bogie names.
		String[] bogieIds = {"BG101", "BG609" , "BG307" , "BG455" , "BG488"};
		Arrays.sort(bogieIds);
		String searchId = "BG455";
		System.out.println("Bogie ids (Sorted):");
		for(String id : bogieIds) {
			System.out.print(id + " ");
		}
		System.out.println();
		boolean found = false;
		// doing a binary search to find the bogie id
		int start = 0;
		int end = bogieIds.length;
		while(start <= end) {
			int mid = start + ((end - start) / 2);
			if(bogieIds[mid].equals(searchId)) {
				found = true;
				break;
			}
			else if(bogieIds[mid].compareTo(searchId) < 0) {
				start = mid + 1;
			}
			else end = mid - 1;
		}
		
		// if the bogie id is found, then prints found
		if(found) {
			System.out.println(searchId + " Found in train consist");
		}
		else System.out.println(searchId + " Not found in train consit");
	}
}
