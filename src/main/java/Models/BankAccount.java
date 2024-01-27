package Models;

public class BankAccount {
    String ownerName;
    int AccountNo;
    double Balance;

    public BankAccount(String ownerName, int accountNo, double balance) {
        this.ownerName = ownerName;
        AccountNo = accountNo;
        Balance = balance;
    }

    public BankAccount() {
    }
    public String printAccount()
    {
        return ownerName+" "+AccountNo+" "+Balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(int accountNo) {
        AccountNo = accountNo;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }
}
