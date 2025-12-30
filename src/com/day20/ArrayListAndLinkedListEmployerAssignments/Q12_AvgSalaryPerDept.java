package com.day20.ArrayListAndLinkedListEmployerAssignments;
import java.util.*;
public class Q12_AvgSalaryPerDept {
    public static void main(String[] args){
        List<Employee> list=EmployeeData.load();
        Map<String,double[]> map=new HashMap<>();

        for(Employee e:list){
            map.putIfAbsent(e.depName,new double[2]);
            map.get(e.depName)[0]+=e.salary;
            map.get(e.depName)[1]++;
        }

        for(String d:map.keySet()){
            double[] arr=map.get(d);
            System.out.println(d+" Avg Salary: "+(arr[0]/arr[1]));
        }
    }
}
