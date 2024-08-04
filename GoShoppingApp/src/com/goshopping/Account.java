package com.goshopping;

public abstract class Account {
    private String username;
    private String email;
    protected double balance;

    public Account(String username, String email, double balance) {
        this.username = username;
        this.email = email;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double amount) {
        this.balance += amount;
    }

    public abstract void showAccountType();
}
