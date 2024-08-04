package com.goshopping;

public class PrimeAccount extends Account {
    private String primeBenefits;

    public PrimeAccount(String username, String email, double balance, String primeBenefits) {
        super(username, email, balance);
        this.primeBenefits = primeBenefits;
    }

    public String getPrimeBenefits() {
        return primeBenefits;
    }

    @Override
    public void showAccountType() {
        System.out.println("This is a Prime Account with benefits: " + primeBenefits);
    }
}
