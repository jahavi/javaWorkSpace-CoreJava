
package com.day8.arrays.Assignmnets8;
public class InsertElement {

	public static void main(String[] args) {
		int[] original = {10, 20, 30, 40, 50};
        int element = 99;      // element to insert
        int position = 2;      // index where to insert (0-based index)

        int[] newArray = new int[original.length + 1];

        // Copy elements before position
        for (int i = 0; i < position; i++) {
            newArray[i] = original[i];
        }

        // Insert element at the given position
        newArray[position] = element;

        // Copy remaining elements
        for (int i = position; i < original.length; i++) {
            newArray[i + 1] = original[i];
        }

        // Print the new array
        System.out.println("Array After Inserting Element:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
