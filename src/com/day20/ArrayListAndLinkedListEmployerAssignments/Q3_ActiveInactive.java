package com.day20.ArrayListAndLinkedListEmployerAssignments;
import java.util.*;
public class Q3_ActiveInactive {
    public static void main(String[] args){
        List<Employee> list=EmployeeData.load();
        List<Employee> active=new ArrayList<>();
        List<Employee> inactive=new ArrayList<>();

        for(Employee e:list){
            if(e.status.equalsIgnoreCase("active")) active.add(e);
            else inactive.add(e);
        }

        System.out.println("Active: "+active);
        System.out.println("Inactive: "+inactive);
    }
}
