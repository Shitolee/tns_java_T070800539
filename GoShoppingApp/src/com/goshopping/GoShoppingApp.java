package com.goshopping;

import java.util.ArrayList;
import java.util.List;

public class GoShoppingApp {
    private List<Account> accounts;

    public GoShoppingApp() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void showAccounts() {
        for (Account account : accounts) {
            System.out.println("Username: " + account.getUsername());
            System.out.println("Email: " + account.getEmail());
            System.out.println("Balance: " + account.getBalance());
            account.showAccountType();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GoShoppingApp app = new GoShoppingApp();

        PrimeAccount primeAcc = new PrimeAccount("shivani_shitole", "shivani@example.com", 101.0, "Free Shipping, Early Access");
        NormalAccount normalAcc = new NormalAccount("shiv_shitole", "shiv@example.com", 55.0);

        app.addAccount(primeAcc);
        app.addAccount(normalAcc);

        app.showAccounts();
    }
}
