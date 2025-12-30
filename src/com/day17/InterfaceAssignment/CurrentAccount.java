package com.day17.InterfaceAssignment;
public class CurrentAccount implements Account {
    double balance;
    public void deposit(double amt){ balance+=amt; }
    public void withdraw(double amt){ balance-=amt; }
    public double calculateInterest(){ return 0; }
    public double getBalance(){ return balance; }
}
