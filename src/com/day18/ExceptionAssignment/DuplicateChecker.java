package com.day18.ExceptionAssignment;

import java.util.*;

public class DuplicateChecker {
    public static void checkDuplicates(List<Integer> list) throws DuplicateNumberException {
        Set<Integer> set = new HashSet<>();
        for(int n : list){
            if(!set.add(n)){
                throw new DuplicateNumberException("Duplicate number found: " + n);
            }
        }
        System.out.println("No duplicates found");
    }
}
