
package com.day8.arrays.Assignmnets8;
public class CopyArray {

	public static void main(String[] args) {
		int[] original = {10, 20, 30, 40, 50};

        int[] copy = new int[original.length];

        // Copy elements using loop
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        System.out.println("Copied Array:");
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}