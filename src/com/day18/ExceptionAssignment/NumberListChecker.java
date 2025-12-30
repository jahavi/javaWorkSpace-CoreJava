package com.day18.ExceptionAssignment;

import java.io.*;
import java.util.*;

public class NumberListChecker {
    public static void checkNumbers(String file) throws Exception {
        Scanner sc = new Scanner(new File(file));
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            if(num > 0){
                throw new PositiveNumberException("Positive number found: " + num);
            }
        }
        sc.close();
    }
}
