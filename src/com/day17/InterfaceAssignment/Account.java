package com.day17.InterfaceAssignment;
public interface Account {
    void deposit(double amt);
    void withdraw(double amt);
    double calculateInterest();
    double getBalance();
}
