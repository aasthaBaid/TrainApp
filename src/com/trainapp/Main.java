package com.trainapp;

import java.util.*;
import java.util.Scanner;


/* UC2: Add Passenger Bogies to Train (ArrayList Operations)
 * @author developer
 * @version 2.0
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

		// adding bogies to list 
		trainConsist.add("Sleeper");
		trainConsist.add("AC Chair");
		trainConsist.add("First class");
		System.out.println("Current Train Consist:" + trainConsist);

		// removing AC chair
		System.out.println("After removing AC chair:");
		trainConsist.remove("AC Chair");
		System.out.println("Current Train Consist:" + trainConsist);
		// checking if sleeper exists:
		
		System.out.println("Does sleeper exists:");
		boolean hasSleeper = trainConsist.contains("Sleeper");
		if(hasSleeper) {
			System.out.println("Sleeper present?: True");
		}
		else {
			System.out.println("Sleeper present?: False");
		}
		// printing final train bogies.
		System.out.println("Final train bogies:" + trainConsist);
	}

}
