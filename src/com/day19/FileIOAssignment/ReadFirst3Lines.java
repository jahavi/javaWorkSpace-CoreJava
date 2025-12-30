package com.day19.FileIOAssignment;
import java.io.*;
public class ReadFirst3Lines {
    public static void read(String path) throws Exception{
        BufferedReader br=new BufferedReader(new FileReader(path));
        for(int i=0;i<3;i++){
            String line=br.readLine();
            if(line==null) break;
            System.out.println(line);
        }
    }
}
