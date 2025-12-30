package com.day19.FileIOAssignment;
import java.nio.file.*;
public class ReadBytes {
    public static byte[] read(String path) throws Exception{
        return Files.readAllBytes(Paths.get(path));
    }
}
