package Bank;

public class Main {
    public static void main(String[] args) {
        BankSingleton bank = BankSingleton.getInstance();

        Admin bigboss = new Admin("bb", "3333", "1222");
        Employee janna = new Employee("jannakam", "12345", "WS43", "janna", "Trainee", 1200.0, 20.0);
        System.out.println(janna.getSalary());
        janna.addBonus(200);
        janna.deductSalary(20);
        janna.workOvertime(50);
        janna.calculateSalary();
        System.out.println(janna.getSalary());
        janna.addPayment(40, "KNET");
        janna.displayPaymentHistory();

    }


}
