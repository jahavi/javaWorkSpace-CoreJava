
package com.day8.arrays.Assignmnets8;
public class ArrayEquality {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {10, 20, 30, 40, 50};

        boolean isEqual = true;

        // Step 1: Check lengths
        if (arr1.length != arr2.length) {
            isEqual = false;
        } else {

            // Step 2: Compare elements one by one
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isEqual = false;
                    break;
                }
            }
        }

        // Step 3: Print result
        if (isEqual) {
            System.out.println("Both arrays are equal.");
        } else {
            System.out.println("Arrays are NOT equal.");
        }
    }
}
