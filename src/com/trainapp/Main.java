package com.trainapp;

import java.util.*;
//import java.util.Scanner;


/* UC4: Maintain Ordered Bogie IDs LinkedList)
 * @author developer
 * @version 4.0
 * 
 * */
public class Main {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- Train Management App! ---\n");
		// linkedlist maintains the insertion order
		List<String> trainConsist = new LinkedList<>();
		trainConsist.add("Sleeper");
		trainConsist.add("Engine");
		trainConsist.add("AC");
		trainConsist.add("Cargo");
		trainConsist.add("Guard");
		
		System.out.println("Initial Train Consist: " +trainConsist);
		
		//adding at an index
		trainConsist.add(2, "Pantry Car");
		System.out.println("After inserting pantry car: " +trainConsist);
		
		// removing first and last bogie
		trainConsist.removeFirst();
		trainConsist.removeLast();
		// printing the final list
		System.out.println("After removing first and last bogie: " + trainConsist);


	}

}
