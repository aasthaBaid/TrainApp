package com.trainapp;

import java.util.*;

/* UC13: Performance Comparison (Loops vs Streams)
 * @author developer
 * @version 13.0
 * 
 * */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" --- Train Management App! ---\n");

		List<Bogie> bogies = new ArrayList<>();
		bogies.add(new Bogie("Sleeper" , 72));
		bogies.add(new Bogie("AC chair" , 54));
		bogies.add(new Bogie("First Class" , 24));
		bogies.add(new Bogie("General" , 90));

		double startTime = System.nanoTime();
		// use for loop to filter

		List<Bogie> loopFiltered = new ArrayList<>();
		for (Bogie b : bogies) {
			if (b.capacity >= 50) {
				loopFiltered.add(b);
			}
		}

		double endTime = System.nanoTime();
		double timeTaken = endTime - startTime;
		System.out.println("Time Taken for loop operation : " + timeTaken);

		double streamStart = System.nanoTime();
		// use stream to filer

		List<Bogie> streamFiltered = bogies.stream()
				.filter(b -> b.capacity >= 50)
				.toList();

		double streamEnd = System.nanoTime();
		double streamTime = streamEnd - streamStart;
		System.out.println("Time Taken for Stream operation : " + streamTime);
	}
}


