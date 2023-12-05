package com.juaracoding;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class BankTest {

    BankAccount bankAccount;

    @BeforeMethod
    public void setUp(){
        bankAccount = new BankAccount();
    }

    @Test
    public void setTest(){
        bankAccount.setAccount(111, "Boby", 3000000.0);
        Assert.assertEquals(bankAccount.getAmount(), 3000000.0);
    }

    @Test
    public void depositTest(){
        bankAccount.setAccount(111, "Boby", 1000.0);
        bankAccount.deposit(500.0);
        Assert.assertEquals(bankAccount.getAmount(), 1500.0);
    }

    @Test
    public void WithdrawTest_If() {
        bankAccount.setAccount(111, "Boby", 1000.0);
        boolean withdrawalSuccess = bankAccount.withdraw(1500.0);
        Assert.assertTrue(withdrawalSuccess);
    }

    @Test
    public void withdrawTest_Else(){
        bankAccount.setAccount(111, "Boby", 1000.0);
        boolean withdrawalSuccess = bankAccount.withdraw(500.0);
        Assert.assertFalse(withdrawalSuccess);
    }




}
