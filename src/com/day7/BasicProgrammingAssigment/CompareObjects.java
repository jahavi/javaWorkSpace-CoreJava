package com.day7.BasicProgrammingAssigment;

class Student {
    int id;
    String name;
}

public class CompareObjects {
    public static void main(String[] args) {

        // Creating first object
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "John";

        // Creating second object
        Student s2 = new Student();
        s2.id = 1;
        s2.name = "John";

        // Comparing using simple if conditions
        if (s1.id == s2.id && s1.name.equals(s2.name)) {
            System.out.println("Both students are same.");
        } else {
            System.out.println("Students are different.");
        }
    }
}
