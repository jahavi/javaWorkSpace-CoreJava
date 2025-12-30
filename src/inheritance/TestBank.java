package inheritance;
class BankAccount {
    double balance;

    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawn: " + amount);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied. Minimum balance of 100 must be maintained.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}
public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount sa = new SavingsAccount(500);

        sa.deposit(200);
        sa.withdraw(550);
        sa.withdraw(100);

        System.out.println("Final Balance: " + sa.balance);
	}

}
