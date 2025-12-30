package com.day19.FileIOAssignment;
import java.nio.file.*;
import java.io.IOException;
public class AppendText {
    public static void append(String path,String text) throws IOException{
        Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.APPEND);
    }
}
