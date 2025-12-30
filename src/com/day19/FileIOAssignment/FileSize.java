package com.day19.FileIOAssignment;
import java.io.File;
public class FileSize {
    public static void size(String path){
        File f=new File(path);
        long bytes=f.length();
        System.out.println("Bytes: "+bytes);
        System.out.println("KB: "+(bytes/1024.0));
        System.out.println("MB: "+(bytes/1024.0/1024.0));
    }
}
