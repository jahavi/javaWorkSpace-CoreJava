package com.day20.ArrayListAndLinkedListEmployerAssignments;
import java.util.*;
public class Q9_SortByName {
    public static void main(String[] args){
        List<Employee> list=EmployeeData.load();
        list.sort(Comparator.comparing(e->e.empName));
        list.forEach(System.out::println);
    }
}
