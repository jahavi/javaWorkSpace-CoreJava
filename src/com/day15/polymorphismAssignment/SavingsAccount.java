package com.day15.polymorphismAssignment;

public class SavingsAccount extends BankAccount {
    @Override
    public void withdraw(double amt){
        if(amt <= balance && amt <= 5000){
            balance -= amt;
        } else {
            System.out.println("Withdrawal limit exceeded");
        }
    }
}
