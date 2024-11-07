package Bank;

public class User {
    private String username;
    private String password;
    private BankAccount account;

    // constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public BankAccount getAccount() {
        return account;
    }

    // setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    // methods
    public void displayAccountDetails() {
        System.out.println(account.toString());
    }

    public void updateUsername(String newUsername) {
        this.username = newUsername;
    }

    public void updatePassword(String newPassword) {
        this.password = newPassword;

    }

}
