package com.trainapp;

import java.util.*;

/* UC16: Sort Passenger Bogies by Capacity (Bubble Sort – Algorithm Intro)
 * @author developer
 * @version 16.0
 * 
 * */
public class Main {

	public static void main(String[] args){

		System.out.println(" --- Train Management App! ---\n");
		
		// Create array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        // Display original order
        System.out.println("Original Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // Outer loop controls number of passes
        for (int i = 0; i < capacities.length - 1; i++) {
            // Inner loop compares adjacent elements
            for (int j = 0; j < capacities.length - 1 - i; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Display sorted result
        System.out.println("\n\nSorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

	}
}
