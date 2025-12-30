package com.day20.ArrayListAndLinkedListEmployerAssignments;
import java.util.*;
public class Q6_GenderCount {
    public static void main(String[] args){
        List<Employee> list=EmployeeData.load();
        int male=0,female=0;
        for(Employee e:list){
            if(e.gender.equalsIgnoreCase("male")) male++;
            else female++;
        }
        System.out.println("Male: "+male+" Female: "+female);
    }
}
