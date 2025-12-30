package com.day20.ArrayListAndLinkedListEmployerAssignments;
import java.util.*;
public class Q5_MaxSalaryByDept {
    public static void main(String[] args){
        List<Employee> list=EmployeeData.load();
        Map<String,Employee> map=new HashMap<>();

        for(Employee e:list){
            map.compute(e.depName,(k,v)->(v==null|| e.salary>v.salary)?e:v);
        }

        System.out.println(map);
    }
}
