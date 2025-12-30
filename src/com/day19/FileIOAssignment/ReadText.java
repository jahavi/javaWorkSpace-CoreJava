package com.day19.FileIOAssignment;
import java.nio.file.*;
public class ReadText {
    public static void read(String path) throws Exception{
        for(String line: Files.readAllLines(Paths.get(path))) System.out.println(line);
    }
}
