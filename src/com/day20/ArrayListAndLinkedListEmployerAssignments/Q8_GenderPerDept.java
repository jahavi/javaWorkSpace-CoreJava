package com.day20.ArrayListAndLinkedListEmployerAssignments;
import java.util.*;
public class Q8_GenderPerDept {
    public static void main(String[] args){
        List<Employee> list=EmployeeData.load();
        Map<String,int[]> map=new HashMap<>();

        for(Employee e:list){
            map.putIfAbsent(e.depName,new int[2]); 
            if(e.gender.equalsIgnoreCase("male")) map.get(e.depName)[0]++;
            else map.get(e.depName)[1]++;
        }

        for(String d:map.keySet()){
            int[] arr=map.get(d);
            System.out.println(d+" -> Male:"+arr[0]+" Female:"+arr[1]);
        }
    }
}
