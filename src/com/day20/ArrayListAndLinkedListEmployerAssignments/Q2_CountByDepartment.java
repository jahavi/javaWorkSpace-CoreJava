package com.day20.ArrayListAndLinkedListEmployerAssignments;
import java.util.*;
public class Q2_CountByDepartment {
    public static void main(String[] args){
        List<Employee> list = EmployeeData.load();
        Map<String,Integer> map=new HashMap<>();

        for(Employee e:list){
            map.put(e.depName, map.getOrDefault(e.depName,0)+1);
        }

        System.out.println(map);
    }
}
