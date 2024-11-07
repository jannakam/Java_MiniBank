package Bank;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private List<Transaction> transactionHistory;

    // constructor
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.transactionHistory = new ArrayList<>();
    }

    // getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    // setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTransactionHistory(List<Transaction> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    // methods

    public void deposit(double amount) {
        this.balance += amount;

        Calendar calendar = Calendar.getInstance();

        Date currentDate = calendar.getTime();

        transactionHistory.add(new Transaction(currentDate, "deposit", amount));
    }

    public void withdrawal(double amount) {
        if (balance > amount) {
            this.balance -= amount;
        }
        Calendar calendar = Calendar.getInstance();

        Date currentDate = calendar.getTime();

        transactionHistory.add(new Transaction(currentDate, "withdrawal", amount));
    }

    public void displayTransactionHistory() {
        for (Transaction transaction : transactionHistory) {
            System.out.println(transaction.toString());
        }
    }

}
