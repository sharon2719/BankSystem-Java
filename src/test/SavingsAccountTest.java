package test;

import bank.SavingsAccount;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest extends BankAccountTest {
    SavingsAccount savingsAccount=new SavingsAccount(5.5);

    @Test
    void calculateMonthlyInterestTest() {
        Assert.assertEquals(45.83,savingsAccount.calculateMonthlyInterest(),45.83);
    }

    @Test
    void getAnnualInterestRateTest() {
        Assert.assertEquals(550,savingsAccount.getAnnualInterestRate(),550);
    }


}