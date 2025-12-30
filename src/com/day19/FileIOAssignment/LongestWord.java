package com.day19.FileIOAssignment;
import java.io.*;
public class LongestWord {
    public static void find(String path) throws Exception{
        BufferedReader br=new BufferedReader(new FileReader(path));
        String longest="";
        String line;
        while((line=br.readLine())!=null){
            for(String w: line.split("\s+")){
                if(w.length()>longest.length()) longest=w;
            }
        }
        System.out.println("Longest: "+longest);
    }
}
