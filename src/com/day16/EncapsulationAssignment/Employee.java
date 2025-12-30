package com.day16.EncapsulationAssignment;

public class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public int getEmployeeId() { return employee_id; }
    public void setEmployeeId(int employee_id) { this.employee_id = employee_id; }

    public String getEmployeeName() { return employee_name; }
    public void setEmployeeName(String employee_name) { this.employee_name = employee_name; }

    public String getEmployeeSalary() { 
        return "Salary: $" + employee_salary; 
    }
}
