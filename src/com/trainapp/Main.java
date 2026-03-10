package com.trainapp;

import java.util.*;
import java.util.Scanner;

/* UC1 - Initialize Train and Display Consist Summary
 * @author developer
 * @version 1.0
 * 
 * */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- Train Management App! ---\n");
		// using list for dyanmic bogies entry
		List<String> trainConsist = new ArrayList<>();
		// initialising train app.
		System.out.println("Train initiated successfully!");
		// printing the number of bogies and list of bogies.
		System.out.println("Inital Bogie count:" + trainConsist.size());
		System.out.println("Current Train Consist:" + trainConsist);
		
		System.out.println("\nSystem ready for operations!");
	}

}
