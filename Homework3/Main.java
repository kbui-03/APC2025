package Homework3;
import Homework3.accounts.Account;
import Homework3.external.CompanyAccount;
import Homework3.external.ExternalAudit;
import Homework3.accounts.AccountManager;

public class Main {
    public static void main(String[] args) {
        // Create an account
        Account acc = new Account("Alice", 1000.0, 1234, "VIP");

        // Print owner
        System.out.println("Owner: " + acc.owner);

        // Get balance
        System.out.println("Balance: $" + acc.getBalance());

        /* Changing PIN with wrong current PIN
        boolean pinChangeResult1 = acc.changePin(1111, 4321);
        System.out.println("PIN change with wrong current PIN: " + pinChangeResult1);
        */

        // Test AccountManager (same package)
        AccountManager manager = new AccountManager();
        System.out.println("\nAccountManager accessing fields:");
        manager.accessAccount(acc);

        // Test CompanyAccount (different package, subclass)
        CompanyAccount compAcc = new CompanyAccount("CompanyXYZ", 50000.0, 9999, "Internal Note");
        System.out.println("\nCompanyAccount accessing inherited fields:");
        compAcc.accessAccount();

        // Test ExternalAudit (different package, not subclass)
        ExternalAudit audit = new ExternalAudit();
        System.out.println("\nExternalAudit accessing fields:");
        audit.auditAccount(acc);
    }
}

