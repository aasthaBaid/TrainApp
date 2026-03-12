package com.trainapp;

import java.util.*;

/* UC12: Safety Compliance Check for Goods Bogies
 * @author developer
 * @version 12.0
 * 
 * */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" --- Train Management App! ---\n");
		// Create goods bogies list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal")); 
        // Display bogies
        System.out.println("Goods Bogies in Train:");
        goodsBogies.forEach(bg -> System.out.println(bg.type + " -> " + bg.cargo));
        System.out.println();

        // Safety rule:
        // Cylindrical bogies are ONLY safe if carrying Petroleum
        boolean isSafe = goodsBogies.stream().allMatch(bg -> {
            if (bg.type.equalsIgnoreCase("Cylindrical")) {
                return bg.cargo.equalsIgnoreCase("Petroleum");
            }
            return true; // all other bogies okay
        });

        // Print result
        System.out.println("Safety Compliance Status: " + isSafe);

        if (isSafe) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is NOT SAFE.");
        }

	}	

}


