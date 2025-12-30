package com.day20.ArrayListAndLinkedListEmployerAssignments;
import java.util.*;
public class Q7_AvgSalaryGender {
    public static void main(String[] args){
        List<Employee> list=EmployeeData.load();
        double maleSum=0,maleCount=0,femaleSum=0,femaleCount=0;

        for(Employee e:list){
            if(e.gender.equalsIgnoreCase("male")){ maleSum+=e.salary; maleCount++; }
            else { femaleSum+=e.salary; femaleCount++; }
        }

        System.out.println("Avg Male Salary: "+(maleSum/maleCount));
        System.out.println("Avg Female Salary: "+(femaleSum/femaleCount));
    }
}
