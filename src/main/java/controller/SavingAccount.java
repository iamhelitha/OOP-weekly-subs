package controller;

import Model.BankAccount;

public class SavingAccount extends BankAccount {
    //attribute
    double interestRate;
    boolean flag; // joint account or not
    int totSavingsAccounts;

    //constructor methods
    public SavingAccount(){
        totSavingsAccounts++;
    }

    public SavingAccount(String ownerName,int accountNo, double balance, double interestRate,boolean flag)
    {
        super(ownerName,accountNo,balance);
        this.interestRate=interestRate;
        this.flag=flag;
        totSavingsAccounts++;
    }
    //other methods
    public double getCalculatedBalance () {
        return((interestRate * getBalance())+getBalance());
    }

    @Override
    public String printAccount() {
        return super.printAccount()+ " "+ interestRate + " " + flag;
    }
    //getter and setter
    public double getInterestRate() {
        return interestRate;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    //next

    public int totSavingsAccounts() {
        return totSavingsAccounts;
    }
}
