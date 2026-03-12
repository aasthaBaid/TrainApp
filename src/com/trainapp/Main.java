package com.trainapp;

import java.util.*;

/* UC15: Safe Cargo Assignment Using try-catch-finally
 * @author developer
 * @version 15.0
 * 
 * */
public class Main {

	public static void main(String[] args){

		System.out.println(" --- Train Management App! ---\n");
		// trying to create a boggie for sleeper
		GoodsBogie b1 = new GoodsBogie("Cylindrical");
		b1.assignCargo("Petroleum");

		System.out.println();

		// INVALID assignment (will trigger exception)
		GoodsBogie b2 = new GoodsBogie("Rectangular");
		b2.assignCargo("Petroleum");   // unsafe

	}
}


