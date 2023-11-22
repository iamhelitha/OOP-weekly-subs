package Model;

public class BankAccount {

    String ownerName;
    int accountNumber;
    double balance;

    //constructor


    public BankAccount(String ownerName, int accountNumber, double balance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount() {
        this.ownerName = "";
        this.accountNumber = 0;
    }

    //other methods
    public String printAccount() {
        return ownerName + " - "    + accountNumber + " and " + balance;
    }

    //setters method
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //getter method

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }
}
