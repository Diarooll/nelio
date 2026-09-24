package entities;

public class SavingsAccount extends Account{
    private double loanLimit;

    public SavingsAccount() {
    }
    public SavingsAccount(String holder, int number, double balance, double loanLimit) {
        super(holder, number, balance);
        this.loanLimit = loanLimit;
    }
    public double getLoanLimit() {
        return loanLimit;
    }
    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}
