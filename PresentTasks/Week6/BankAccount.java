package PresentTasks.Week6;

public class BankAccount {
    private int balance;
    public BankAccount (int initialBalance ) {
        this.balance = initialBalance ;
    }

    public int getBalance () {
        return balance;
    }

    public synchronized void deposit (int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public synchronized void withdraw (int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount must be positive: " + amount + "\n" +
                               "Current balance: " + balance);
        }
    }
}
