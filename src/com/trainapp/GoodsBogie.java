package com.trainapp;

public class GoodsBogie {

	String shape;  
	String cargo;   

	GoodsBogie(String shape) {
		this.shape = shape;
	}
	void assignCargo(String cargo) {

		try {
			// Rectangular bogie CANNOT carry petroleum (unsafe)
			if (shape.equalsIgnoreCase("Rectangular") &&
					cargo.equalsIgnoreCase("Petroleum")) {

				throw new CargoSafetyException(
						"Unsafe Assignment: Rectangular bogie cannot carry Petroleum"
						);
			}
			this.cargo = cargo;
			System.out.println("Cargo assigned successfully: "
					+ shape + " -> " + cargo);

		} catch (CargoSafetyException ex) {
			System.out.println("Error: " + ex.getMessage());
		} finally {
			System.out.println("Cargo assignment attempt completed.");

		}
	}
}