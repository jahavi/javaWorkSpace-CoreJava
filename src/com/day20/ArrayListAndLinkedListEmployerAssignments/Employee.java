package com.day20.ArrayListAndLinkedListEmployerAssignments;
public class Employee {
    int empId;
    String empName;
    String depName;
    String gender;
    String status;
    double salary;

    public Employee(int empId, String empName, String depName, String gender, String status, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.depName = depName;
        this.gender = gender;
        this.status = status;
        this.salary = salary;
    }

    public String toString() {
        return empId+" - "+empName+" - "+depName+" - "+gender+" - "+status+" - "+salary;
    }
}
