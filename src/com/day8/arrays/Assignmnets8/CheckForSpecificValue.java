package com.day8.arrays.Assignmnets8;

public class CheckForSpecificValue {
	public static void main(String[] args) {
		char checkSpecificValue = 'P';
		String inputCheck = "CHEAPMENTALITY";
		for(char val:inputCheck.toCharArray()){
			
			if(checkSpecificValue == val) {
				System.out.println("Yes P is present in the input");
				break;
			}else {
				System.out.println("There is no Letter P in the input value");
			}
		}
	}
}
