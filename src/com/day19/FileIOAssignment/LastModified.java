package com.day19.FileIOAssignment;
import java.io.File;
import java.util.Date;
public class LastModified {
    public static void check(String path){
        File f=new File(path);
        System.out.println(new Date(f.lastModified()));
    }
}
