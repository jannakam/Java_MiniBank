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
        users.add(newUser); // Ensure the new user is added to the list of users
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

}
