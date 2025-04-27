package Homework3.external;
import Homework3.accounts.Account;

public class ExternalAudit {

    public void auditAccount(Account account) {
        System.out.println(account.owner);            //public - accessible
        System.out.println(account.getBalance());    //private - accessible through public getter
        // System.out.println(account.balance);     //private - not accessible
        // System.out.println(account.pin);        // protected - not accessible outside the package
        // System.out.println(account.internalNote);  //default - not accessible outside the package
    }
}
