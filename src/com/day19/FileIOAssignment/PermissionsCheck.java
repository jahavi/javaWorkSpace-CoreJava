package com.day19.FileIOAssignment;
import java.io.File;
public class PermissionsCheck {
    public static void check(String path){
        File f=new File(path);
        System.out.println("Readable: "+f.canRead());
        System.out.println("Writable: "+f.canWrite());
    }
}
