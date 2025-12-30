package com.day15.polymorphismAssignment;

public class BankAccount {
    double balance;
    public void deposit(double amt){ balance += amt; }
    public void withdraw(double amt){
        balance -= amt;
    }
}
