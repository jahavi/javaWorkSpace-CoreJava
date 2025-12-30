
package com.day8.arrays.Assignmnets8;
public class DuplicateStringValues {

	public static void main(String[] args) {
		String[] arr = {"apple", "banana", "orange", "apple", "grape", "banana"};

        System.out.println("Duplicate string values in the array:");

        // Compare strings using equals()
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i].equals(arr[j])) {
                    System.out.println(arr[i]);
                }

            }
        }
    }
}
