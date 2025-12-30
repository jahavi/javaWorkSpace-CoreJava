package com.day19.FileIOAssignment;
import java.nio.file.*;
public class ReadIntoVariable {
    public static String load(String path) throws Exception{
        return String.join("\n", Files.readAllLines(Paths.get(path)));
    }
}
