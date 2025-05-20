package PresentTasks.Week6;

public class TransactionThread implements Runnable {
    private BankAccount account;
    private int amount;
    private boolean deposit;

    public TransactionThread(BankAccount account, int amount, boolean deposit) {
        this.account = account;
        this.amount = amount;
        this.deposit = deposit;
    }

    @Override
    public void run() {
        if (deposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        for (int i = 0; i < 1000; i++) {
            // System.out.println("Thread " + i + " started");
            Thread t1 = new Thread(new TransactionThread(account, 10, true));
            Thread t2 = new Thread(new TransactionThread(account, 10, false));

            t1.start();
            t2.start();

            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Final balance: " + account.getBalance());
    }
}
