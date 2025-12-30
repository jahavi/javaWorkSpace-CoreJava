package com.day19.FileIOAssignment;
import java.io.File;
public class FilterExtensions {
    public static void listByExt(String path, String ext){
        File f=new File(path);
        if(f.exists()){
            for(File file: f.listFiles()){
                if(file.getName().endsWith(ext)) System.out.println(file.getName());
            }
        }
    }
}
