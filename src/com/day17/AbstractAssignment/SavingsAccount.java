package com.day17.AbstractAssignment;

public class SavingsAccount extends BankAccount {
    public void deposit(double amt){ balance+=amt; }
    public void withdraw(double amt){
        if(amt<=balance) balance-=amt;
    }
}
