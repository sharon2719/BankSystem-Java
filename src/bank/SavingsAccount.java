package bank;

import java.util.Date;

public class SavingsAccount extends BankAccount {

    private double interestRate;
    private double annualInterestRate;

    public SavingsAccount(String accountName, String accountNumber, String bankBranch, double amount,double rate) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.bankBranch = bankBranch;
        this.accountBalance = amount;
        interestRate = rate;
        Date date=new Date();
        date.toString();

    }

        @Override
    public Object withdraw(double amount) throws NotSufficientFundException {

        super.withdraw(amount);
        int withdrawal =3;
        if(withdrawal >3){
            throw new NotSufficientFundException("You cannot do more than 3 withdrawal transactions per year.");

        }
            return null;
        }



    public double calculateMonthlyInterest() {
        return (getToDisplayAccountBalance() * interestRate/12)/100;
    }


    public double getAnnualInterestRate() 
    {
        
        annualInterestRate=calculateMonthlyInterest()*12;
        return annualInterestRate;
    }

}
