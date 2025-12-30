package com.day18.ExceptionAssignment;

import java.io.*;

public class FileReaderDemo {
    public static void readFile(String filename) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(filename);
        System.out.println("File opened successfully");
    }
}
