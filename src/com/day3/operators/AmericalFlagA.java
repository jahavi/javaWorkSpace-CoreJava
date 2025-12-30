//Assignement2-14
package com.day3.operators;

import java.util.stream.IntStream;

public class AmericalFlagA {
	public static void main(String[] args) {
		for(int i=0;i<=3;i++) {
			if(i%2==0) {
				for(int j=0;j<=4;j++) {
					System.out.print("*");
				}
				IntStream.range(0, 14).forEach(m -> System.out.print("="));
				System.out.println("");
			}else {
				for(int j=0;j<=3;j++) {
					System.out.print("*");
				}
				System.out.print(" ");
				IntStream.range(0, 14).forEach(h -> System.out.print("="));
				System.out.println("");

			}
		}
		for (int j=0; j<=3;j++) {
			for (int p=0;p<19;p++) {
				System.out.print("=");
			}
			System.out.println("");
		}
	}
}