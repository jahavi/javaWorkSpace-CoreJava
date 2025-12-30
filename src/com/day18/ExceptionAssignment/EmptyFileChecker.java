package com.day18.ExceptionAssignment;

import java.io.*;

public class EmptyFileChecker {
    public static void checkEmpty(String file) throws Exception {
        File f = new File(file);
        if(f.length() == 0) {
            throw new EmptyFileException("File is empty!");
        }
        System.out.println("File is not empty");
    }
}
