package com.day8.arrays.Assignmnets8;

public class AvgValueOfArray {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] arr = {2,3,5,1,4};
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
		}
		System.out.println("Avg Value of the array :"+sum/arr.length);
 	}

}


