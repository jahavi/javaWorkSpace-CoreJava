package com.day18.ExceptionAssignment;

public class OddChecker {
    public static void checkEven(int n) throws OddNumberException {
        if(n % 2 != 0) {
            throw new OddNumberException("Number is odd!");
        }
        System.out.println("Number is even");
    }
}
