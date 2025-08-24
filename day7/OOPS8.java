/*
Banking System
Create an abstract class Account with accountNumber and balance. Implement
SavingsAccount and CurrentAccount with different withdrawal rules.
Sample Output:
Savings Account 101 - Balance: ₹50000.0
Withdraw ₹20000: Success
Balance after withdrawal: ₹30000.0
Current Account 202 - Balance: ₹100000.0
Withdraw ₹120000: Overdraft Allowed
Balance after withdrawal: -₹20000.0
 */

package day7;

abstract class Account {
    int accnum;
    double bal;
    Account(int accnum, double bal) {
        this.accnum = accnum;
        this.bal = bal;
    }
    abstract void withdraw(double amount);
    void displayBalance() {
        System.out.println("Balance after withdrawal: ₹" + bal);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(int accnum, double bal) {
        super(accnum, bal);
    }
    @Override
    void withdraw(double amount) {
        if (bal >= amount) {
            bal -= amount;
            System.out.println("Withdraw ₹" + amount + ": Success");
        } else {
            System.out.println("Withdraw ₹" + amount + ": Insufficient funds");
        }
    }
}

class CurrentAccount extends Account {
    CurrentAccount(int accnum, double bal) {
        super(accnum, bal);
    }
    @Override
    void withdraw(double amount) {
        bal -= amount;
        if (bal < 0) {
            System.out.println("Withdraw ₹" + amount + ": Overdraft Allowed");
        } else {
            System.out.println("Withdraw ₹" + amount + ": Success");
        }
    }
}

public class OOPS8 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(101, 50000);
        System.out.println("Savings Account " + savings.accnum + " - Balance: ₹" + savings.bal);
        savings.withdraw(20000);
        savings.displayBalance();
        System.out.println();
        CurrentAccount current = new CurrentAccount(202, 100000);
        System.out.println("Current Account " + current.accnum + " - Balance: ₹" + current.bal);
        current.withdraw(120000);
        current.displayBalance();
    }
}
