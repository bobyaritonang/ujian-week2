package com.juaracoding;

public class BankAccount {
    private int acc_no;
    private String name;
    private double amount;

    public double setAccount(int a, String n, double amt) {
        acc_no = a;
        name = n;
        amount = amt;
        return amount;
    }

    public double deposit(double amt) {
        amount = amount + amt;
        System.out.println(amt + " deposited");
        return amount;
    }

    public boolean withdraw(double amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
            return true;
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdrawn");
            return false;
        }
    }

    public double checkBalance() {
        System.out.println("Balance is: " + amount);
        return amount;
    }

    public String display() {
        String accountInfo = acc_no + " " + name + " " + amount;
        System.out.println(accountInfo);
        return accountInfo;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
