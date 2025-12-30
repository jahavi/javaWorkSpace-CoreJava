package com.day19.FileIOAssignment;
import java.io.*;
public class ReadLines {
    public static void read(String path) throws Exception{
        BufferedReader br=new BufferedReader(new FileReader(path));
        String line;
        while((line=br.readLine())!=null) System.out.println(line);
    }
}
