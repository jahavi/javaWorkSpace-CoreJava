package com.day19.FileIOAssignment;
import java.io.File;
public class PathExists {
    public static void check(String path){
        File f=new File(path);
        System.out.println(f.exists() ? "Exists" : "Does not exist");
    }
}
