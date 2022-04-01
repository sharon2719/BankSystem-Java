package bank;

public class BankAccount implements Balance {
    private double accountBalance;
    private String accountName;
    private String accountNumber;
    private String bankBranch;
    private boolean isAccountActive;

    //    bank constructors
    public BankAccount(String accountName, String accountNumber, String bankBranch, double amount) {

        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.bankBranch = bankBranch;
        this.accountBalance = amount;
        this.isAccountActive = true;
    }

    public BankAccount() {

    }

    //    bank methods
    @Override
    public double getToDisplayAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void closeAccount() {
        isAccountActive = false;
    }

    public boolean isAccountActive() {
        return isAccountActive;
    }

    public void withdraw(double amount) throws NotSufficientFundException {
        if (amount > this.accountBalance) {
            throw new NotSufficientFundException("Amount is greater than the available balance.");
        }
        this.accountBalance -= amount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.accountBalance += amount;
        }
    }

    public double transferTo(BankAccount bankAccount, double amount) {
        bankAccount.accountBalance = bankAccount.accountBalance + amount;
        accountBalance = accountBalance - amount;

        return amount;
    }
}

