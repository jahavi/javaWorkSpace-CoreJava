package ObjectAndConstructorPrograms;
class Account {
    int accountNumber;
    String name;
    double balance;

    void setAccountDetails(int accNo, String n, double bal) {
        accountNumber = accNo;
        name = n;
        balance = bal;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println(accountNumber + " | " + name + " | " + balance);
    }
}

class Bank {
    Account[] accounts = new Account[5];
    int count = 0;

    int findAccountIndex(int accNo) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].accountNumber == accNo) {
                return i;
            }
        }
        return -1;
    }

    void addAccount(int accNo, String n, double bal) {
        if (count < accounts.length) {
            Account a = new Account();
            a.setAccountDetails(accNo, n, bal);
            accounts[count] = a;
            count++;
            System.out.println("Account Added");
        } else {
            System.out.println("Bank is full");
        }
    }

    void removeAccount(int accNo) {
        int index = findAccountIndex(accNo);
        if (index == -1) {
            System.out.println("Account Not Found");
            return;
        }
        for (int j = index; j < count - 1; j++) {
            accounts[j] = accounts[j + 1];
        }
        accounts[count - 1] = null;
        count--;
        System.out.println("Account Removed");
    }

    void depositMoney(int accNo, double amount) {
        int index = findAccountIndex(accNo);
        if (index == -1) {
            System.out.println("Account Not Found");
        } else {
            accounts[index].deposit(amount);
            System.out.println("Amount Deposited");
        }
    }

    void withdrawMoney(int accNo, double amount) {
        int index = findAccountIndex(accNo);
        if (index == -1) {
            System.out.println("Account Not Found");
        } else {
            accounts[index].withdraw(amount);
        }
    }

    void displayAll() {
        if (count == 0) {
            System.out.println("No Accounts in Bank");
            return;
        }
        for (int i = 0; i < count; i++) {
            accounts[i].display();
        }
    }
}
public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();

        b.addAccount(101, "Rakesh", 5000);
        b.addAccount(102, "Priya", 9000);

        b.displayAll();

        b.depositMoney(101, 2000);
        b.withdrawMoney(102, 3000);

        b.displayAll();

        b.removeAccount(101);

        b.displayAll();
	}

}
