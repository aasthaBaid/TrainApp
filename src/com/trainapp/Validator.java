package com.trainapp;

import java.util.regex.Pattern;
public class Validator {
	public final static String train_regex = "^TRN-\\d{4}$";
	public final static String cargo_code = "PET-[A-Z]{2}";
	
	// validated train id for TRN-1234
	public static boolean validateTrainId(String trainId){
		return Pattern.matches(train_regex , trainId);
	}
	// validate cargo code for PET-XY
	public static boolean validateCargoCode(String cargoCode){
		return Pattern.matches(cargo_code, cargoCode);
	}
}
