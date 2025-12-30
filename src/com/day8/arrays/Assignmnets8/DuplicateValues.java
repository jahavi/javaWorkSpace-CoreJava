
package com.day8.arrays.Assignmnets8;
public class DuplicateValues {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 20, 40, 10, 50, 30};

        System.out.println("Duplicate values in the array:");

        // Compare each element with the rest
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }

            }
        }
    }
}
