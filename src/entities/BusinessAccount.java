package entities;

public class BusinessAccount extends Account{
    private double interestRate;

    public BusinessAccount() {
    }
    public BusinessAccount(String holder, int number, double balance, double interestRate) {
        super(holder, number, balance);
        this.interestRate = interestRate;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -=2;
    }
}
