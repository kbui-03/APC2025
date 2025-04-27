package Homework3.accounts;

public class AccountManager {

    public void accessAccount(Account account) {
        System.out.println(account.owner);            //public - accessible
        System.out.println(account.getBalance());    //private - accessible through public getter
        System.out.println(account.pin);            // protected - accessible within same package
        System.out.println(account.internalNote);  //default - accessible within same package
    }
}
