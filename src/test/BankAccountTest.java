package test;

import bank.BankAccount;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
      BankAccount bankAccount = new BankAccount("Jeniffer Smith","0987555555","TRM",100.00);

        @Test
        public void getToDisplayAccountBalanceTest() {
            Assert.assertEquals(100,bankAccount.getToDisplayAccountBalance(),0);
            }

        @Test
        public void depositTest(){
            bankAccount.deposit(100.00);
            assertEquals(200.00,this.bankAccount.getToDisplayAccountBalance());
            bankAccount.deposit(-100.00);
            assertEquals(200.00,this.bankAccount.getToDisplayAccountBalance());

        }

        @Test
        public void closeAccountTest(){
            bankAccount.closeAccount();
            Assert.assertFalse(bankAccount.isAccountActive());
        }

        @Test
        public  void withdrawTest()throws Exception{
            bankAccount.deposit(100);
            bankAccount.withdraw(50.00);
            assertEquals(150,this.bankAccount.getToDisplayAccountBalance());
            bankAccount.withdraw(50.00);
            assertEquals(100,this.bankAccount.getToDisplayAccountBalance());
        }

        @Test
        public void isAccountActiveTest(){
            assertTrue(bankAccount.isAccountActive());
        }

        @Test
        public void transferToTest() {
            BankAccount bankAccount = new BankAccount("Jane Doe","0789675","Embakasi",50.00);
            bankAccount.deposit(100);
            assertEquals(50,bankAccount.transferTo(bankAccount,50));
        }
}


