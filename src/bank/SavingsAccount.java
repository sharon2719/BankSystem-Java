package bank;

public class SavingsAccount extends BankAccount {

    private double interestRate;
    private double annualInterestRate;

    @Override
    public void withdraw(double amount) throws NotSufficientFundException {

        super.withdraw(amount);
    }

    public SavingsAccount(double rate) {

        interestRate = rate;
    }

    public double calculateMonthlyInterest() {
        return (getToDisplayAccountBalance() * interestRate/12)/100;
    }


    public double getAnnualInterestRate() {

        return annualInterestRate;
    }

//    @Override
//    public double getToDisplayAccountBalance() {
//        return super.getToDisplayAccountBalance()+calculateMonthlyInterest();
//    }
}
