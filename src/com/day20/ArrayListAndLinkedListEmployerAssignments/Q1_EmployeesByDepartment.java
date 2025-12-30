package com.day20.ArrayListAndLinkedListEmployerAssignments;
import java.util.*;
public class Q1_EmployeesByDepartment {
    public static void main(String[] args){
        List<Employee> list = EmployeeData.load();
        Map<String,List<Employee>> map=new HashMap<>();

        for(Employee e:list){
            map.computeIfAbsent(e.depName,k->new ArrayList<>()).add(e);
        }

        for(String dep:map.keySet()){
            System.out.println(dep+" : "+map.get(dep));
        }
    }
}
