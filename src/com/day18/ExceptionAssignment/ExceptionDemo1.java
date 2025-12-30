package com.day18.ExceptionAssignment;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        try {
            throw new Exception("This is an exception");
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
