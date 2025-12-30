package com.day19.FileIOAssignment;
import java.nio.file.*;
import java.util.*;
public class LinesToArray {
    public static String[] load(String path) throws Exception{
        List<String> list=Files.readAllLines(Paths.get(path));
        return list.toArray(new String[0]);
    }
}
