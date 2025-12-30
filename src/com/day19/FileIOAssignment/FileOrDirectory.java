package com.day19.FileIOAssignment;
import java.io.File;
public class FileOrDirectory {
    public static void check(String path){
        File f=new File(path);
        if(f.isDirectory()) System.out.println("Directory");
        else if(f.isFile()) System.out.println("File");
        else System.out.println("Not found");
    }
}
