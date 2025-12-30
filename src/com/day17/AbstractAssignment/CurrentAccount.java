package com.day17.AbstractAssignment;

public class CurrentAccount extends BankAccount {
    public void deposit(double amt){ balance+=amt; }
    public void withdraw(double amt){ balance-=amt; }
}
