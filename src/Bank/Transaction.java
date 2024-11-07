package Bank;

import java.util.Date;

public class Transaction {
    private Date date;
    private String type;
    private double amount;

    // constructor
    public Transaction(Date date, String type, double amount) {
        this.date = date;
        this.type = type;
        this.amount = amount;
    }

    // getters
    public Date getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    // setters
    public void setDate(Date date) {
        this.date = date;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
