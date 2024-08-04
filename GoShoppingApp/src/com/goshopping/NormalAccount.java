package com.goshopping;

public class NormalAccount extends Account {

    public NormalAccount(String username, String email, double balance) {
        super(username, email, balance);
    }

    @Override
    public void showAccountType() {
        System.out.println("This is a Normal Account.");
    }
}
