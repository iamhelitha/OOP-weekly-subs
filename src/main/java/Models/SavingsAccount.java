package Models;

public class SavingsAccount  extends  BankAccount {
    double interestRate;
    boolean flag;
    static int totSavingsAccounts;

    public SavingsAccount(String ownerName, int accountNo, double balance,
                          double interestRate, boolean flag)
    {
        super(ownerName,accountNo,balance);
        this.interestRate=interestRate;
        this.flag=flag;
        totSavingsAccounts++;
    }
    public SavingsAccount()
    {
        totSavingsAccounts++;
    }
    public double calculateBalance()
    {
        return  interestRate*getBalance()+getBalance();
    }
    @Override
    public String printAccount()
    {
        return super.printAccount()+" "+interestRate+" "+flag;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
