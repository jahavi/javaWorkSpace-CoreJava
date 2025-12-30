package com.day17.InterfaceAssignment;
public class SavingsAccount implements Account {
    double balance;
    public void deposit(double amt){ balance+=amt; }
    public void withdraw(double amt){ if(amt<=balance) balance-=amt; }
    public double calculateInterest(){ return balance*0.05; }
    public double getBalance(){ return balance; }
}
