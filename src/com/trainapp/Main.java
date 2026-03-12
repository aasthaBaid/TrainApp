package com.trainapp;

import java.util.*;

/* UC11: Validate Train ID & Cargo Codes (Regex)
 * @author developer
 * @version 11.0
 * 
 * */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" --- Train Management App! ---\n");
		
		// take input for train ID and cargo code
		System.out.println("Enter Train ID :");
		String traindId = sc.nextLine();
		System.out.println("Enter Cargo Code:");
		String cargoCode = sc.nextLine();
		 
		// validating and printing validity of train id and cargo code
		if(Validator.validateTrainId(traindId)) {
			System.out.println("Is valid: True");
		}
		else System.out.println("Is valid : False");
		
		if(Validator.validateCargoCode(cargoCode)) {
			System.out.println("Is valid: True");
		}
		else System.out.println("Is valid : False");

	}	

}
