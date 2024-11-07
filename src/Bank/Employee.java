package Bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee extends User {
    private String ID;
    private String name;
    private String position;
    private double salary;
    private double hourlyRate;
    private List<Double> salaryModifiers;
    private List<Payment> payments;

    public Employee(String username, String password, String ID, String name, String position, double salary, double hourlyRate) {
        super(username, password);
        this.ID = ID;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.hourlyRate = hourlyRate;
        this.salaryModifiers = new ArrayList<>();
        this.payments = new ArrayList<>();
    }

    // getters
    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    // setters
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // salary methods
    public void workOvertime(int extraHours) {
        double overtime = extraHours * this.hourlyRate * 1.25;
        salaryModifiers.add(overtime);
    }

    public void addBonus(double bonus) {
        salaryModifiers.add(bonus);
    }

    public void deductSalary(int missingHours) {
        double deduction = missingHours * this.hourlyRate * -1;
        salaryModifiers.add(deduction);
    }

    // after calling individual methods above this main method will calculate the updated salary after overtime, bonuses, deductions, etc.
    public void calculateSalary() {
        for (double modifier: salaryModifiers) {
            this.salary += modifier;
        }
    }

    public void addPayment(double amount, String paymentMethod) {
        Date date = new Date();
        Payment payment = new Payment(date, paymentMethod, amount);
        payments.add(payment);
    }

    // payment methods
    public void displayPaymentHistory() {
        System.out.println(payments);
    }
}
