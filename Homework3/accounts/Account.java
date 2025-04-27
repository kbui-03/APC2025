package Homework3.accounts;

public class Account {
    public String owner;
    private double balance;
    protected int pin;
    String internalNote;

    public Account(String owner, double balance, int pin, String note) {
        this.owner = owner;
        this.balance = balance;
        this.pin = pin;
        this.internalNote = note;
    }

    public double getBalance() {
        return balance;
    }

    public boolean changePin(int oldPin, int newPin) {
        if (this.pin == oldPin) {
            this.pin = newPin;
            return true;
        }
        return false;
    }
}

