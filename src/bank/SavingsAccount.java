package bank;

public class SavingsAccount extends BankAccount {

    private double interestRate;
    private double annualInterestRate;


    public SavingsAccount(double rate) {
        interestRate = rate;
    }

    public double calculateMonthlyInterest() {
        double interest = getToDisplayAccountBalance() * annualInterestRate/12;
        return interest;
    }


    public double getAnnualInterestRate() {

        return annualInterestRate;
    }


}
