package com.day20.ArrayListAndLinkedListEmployerAssignments;
import java.util.*;
public class Q4_MaxMinSalary {
    public static void main(String[] args){
        List<Employee> list=EmployeeData.load();

        Employee max=list.stream().max(Comparator.comparingDouble(e->e.salary)).get();
        Employee min=list.stream().min(Comparator.comparingDouble(e->e.salary)).get();

        System.out.println("Max salary: "+max);
        System.out.println("Min salary: "+min);
    }
}
