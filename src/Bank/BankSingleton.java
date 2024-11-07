package Bank;

import java.util.ArrayList;
import java.util.List;

public class BankSingleton {
    private List<User> users;


    // private instance of class
    private static BankSingleton instance;

    private BankSingleton() {
        users = new ArrayList<>();
    }

    // access instance
    public static BankSingleton getInstance() {
        if (instance == null) {
            instance = new BankSingleton();
        }
        return instance;
    }

    // methods
    public User createUser(String username, String password) {
        for (User user : users) {
            if (username.equals(user.getUsername())) {
                throw new AssertionError("Duplicate username");
            }
        }

        User newUser = new User(username, password);
        users.add(newUser);
        return newUser;
    }

    public User authenticate(String username, String password) {
        if ( username == null || password == null ) {
            return null;
        }

        for (User user : users) {
            if (username.equals(user.getUsername())) {
                if (password.equals(user.getPassword())) {
                    return user;
                }
            }
        }

        return null;
    }

    // only possible if user is an admin
    public Employee createEmployee(String username, String password, String ID, String name, String position, double salary, double hourlyRate, String accessCode) {
        for (User user : users) {

            // check if the provided username is a duplicate
            if (username.equals(user.getUsername())) {
                throw new AssertionError("Duplicate username");
            }

            // check if the person creating the employee account is an admin
            if (user instanceof Admin) {
                Admin admin = (Admin) user;
                if (admin.getAccessCode().equals(accessCode)) {
                    Employee newEmployee = new Employee(username, password, ID, name, position, salary, hourlyRate);
                    users.add(newEmployee);
                    return newEmployee;
                }
            }
        }

        // Return null if no matching admin with correct access code is found
        return null;
    }

}
