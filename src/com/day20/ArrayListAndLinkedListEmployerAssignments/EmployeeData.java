package com.day20.ArrayListAndLinkedListEmployerAssignments;
import java.util.*;
public class EmployeeData {
    public static List<Employee> load() {
        List<Employee> empList=new ArrayList<>();
        empList.add(new Employee(101,"Lohith","CSE","Male","active",20000));
        empList.add(new Employee(102,"Sankar","EEE","Male","inactive",25000));
        empList.add(new Employee(103,"Sankar1","EEE","Male","inactive",26000));
        empList.add(new Employee(104,"Megha","CSE","Female","active",30000));
        empList.add(new Employee(105,"Ravi","IT","Male","active",22000));
        empList.add(new Employee(106,"Priya","IT","Female","inactive",24000));
        empList.add(new Employee(107,"Ramesh","CSE","Male","active",27000));
        return empList;
    }
}
