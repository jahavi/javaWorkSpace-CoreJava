package com.day16.EncapsulationAssignment;

import java.util.ArrayList;

public class Student {
    private int student_id;
    private String student_name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public int getStudentId() { return student_id; }
    public void setStudentId(int student_id) { this.student_id = student_id; }

    public String getStudentName() { return student_name; }
    public void setStudentName(String student_name) { this.student_name = student_name; }

    public void addGrade(int grade){
        if(grade >= 0 && grade <= 100){
            grades.add(grade);
        } else {
            System.out.println("Invalid grade! Must be 0-100.");
        }
    }
}
