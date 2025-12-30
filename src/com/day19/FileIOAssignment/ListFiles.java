package com.day19.FileIOAssignment;
import java.io.File;
public class ListFiles {
    public static void list(String path){
        File f=new File(path);
        if(f.exists() && f.isDirectory()){
            for(String s : f.list()) System.out.println(s);
        }
    }
}
