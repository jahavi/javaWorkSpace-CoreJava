package com.day20.ArrayListAndLinkedListEmployerAssignments;
import java.util.*;
public class Q10_TotalSalaryPerDept {
    public static void main(String[] args){
        List<Employee> list=EmployeeData.load();
        Map<String,Double> map=new HashMap<>();

        for(Employee e:list){
            map.put(e.depName, map.getOrDefault(e.depName,0.0)+e.salary);
        }

        System.out.println(map);
    }
}
