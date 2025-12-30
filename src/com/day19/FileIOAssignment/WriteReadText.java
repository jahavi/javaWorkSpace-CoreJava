package com.day19.FileIOAssignment;
import java.nio.file.*;
import java.util.*;
public class WriteReadText {
    public static void write(String path,String data) throws Exception{
        Files.write(Paths.get(path), data.getBytes());
    }
    public static List<String> read(String path) throws Exception{
        return Files.readAllLines(Paths.get(path));
    }
}
