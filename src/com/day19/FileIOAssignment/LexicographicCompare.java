package com.day19.FileIOAssignment;
import java.io.*;
public class LexicographicCompare {
    public static int compare(String f1,String f2) throws Exception{
        BufferedReader b1=new BufferedReader(new FileReader(f1));
        BufferedReader b2=new BufferedReader(new FileReader(f2));
        String l1,l2;
        while(true){
            l1=b1.readLine(); l2=b2.readLine();
            if(l1==null && l2==null) return 0;
            if(l1==null) return -1;
            if(l2==null) return 1;
            int cmp=l1.compareTo(l2);
            if(cmp!=0) return cmp;
        }
    }
}
