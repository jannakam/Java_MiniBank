package Bank;

import java.util.Date;

public class Payment {
    private Date date;
    private String paymentMethod;
    private double amount;

    public Payment(Date date, String paymentMethod, double amount) {
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    // getters
    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    // setters
    public void setDate(Date date) {
        this.date = date;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "date=" + date +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", amount=" + amount +
                '}';
    }
}
