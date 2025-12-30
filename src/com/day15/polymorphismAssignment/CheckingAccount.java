package com.day15.polymorphismAssignment;

public class CheckingAccount extends BankAccount {
    @Override
    public void withdraw(double amt){
        double fee = 10;
        if(amt + fee <= balance){
            balance -= (amt + fee);
        } else {
            System.out.println("Insufficient funds with fee");
        }
    }
}
