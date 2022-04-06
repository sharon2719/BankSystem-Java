package test;

import bank.SavingsAccount;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest extends BankAccountTest {
    SavingsAccount savingsAccount=new SavingsAccount("John Kim","0975332356","Kilimani",1000.00,5.5);
    SavingsAccount savingsAccount1=new SavingsAccount("Rita Ora","097678998","Ngong Road",500.00,5.5);

    @Test
    void calculateMonthlyInterestTest() {
        Assert.assertEquals(45.83,savingsAccount.calculateMonthlyInterest(),45.83);
    }

    @Test
    void getAnnualInterestRateTest() {
        Assert.assertEquals(550,savingsAccount.getAnnualInterestRate(),550);
    }


    @Test
    void withdrawTest1() {
        savingsAccount.withdraw(100);
        savingsAccount.withdraw(100);
        savingsAccount.withdraw(100);
        Assert.assertEquals(null,savingsAccount.withdraw(300));
    }
}