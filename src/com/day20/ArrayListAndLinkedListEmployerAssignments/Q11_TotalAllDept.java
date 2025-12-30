package com.day20.ArrayListAndLinkedListEmployerAssignments;
import java.util.*;
public class Q11_TotalAllDept {
    public static void main(String[] args){
        List<Employee> list=EmployeeData.load();
        double sum=0;
        for(Employee e:list) sum+=e.salary;
        System.out.println("Total salary all dept: "+sum);
    }
}
