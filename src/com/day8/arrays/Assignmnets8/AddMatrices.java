
package com.day8.arrays.Assignmnets8;
public class AddMatrices {

	public static void main(String[] args) {
		// First matrix
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Second matrix
        int[][] b = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        // Result matrix (same size)
        int[][] sum = new int[3][3];

        // Adding matrices using nested loops
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        // Printing result
        System.out.println("Sum of the two matrices:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}