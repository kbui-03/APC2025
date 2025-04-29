package Homework3.external;

import Homework3.accounts.Account;

public class CompanyAccount extends Account{
    public CompanyAccount(String owner, double balance, int pin, String note) {
        super(owner, balance, pin, note);
    }

   public void accessAccount() {
        System.out.println(owner);            //public - accessible
        System.out.println(getBalance());    //private - accessible through public getter
        // System.out.println(balance);     //private - not accessible
        System.out.println(pin);           // protected - accessible since subclass 
        // System.out.println(internalNote);  //default - not accessible outside the package
    }
}
