package Bank;

public class Admin extends User{
    private String accessCode;

    public Admin(String username, String password, String accessCode) {
        super(username, password);
        this.accessCode = accessCode;
    }

    // getters
    public String getAccessCode() {
        return accessCode;
    }

    // setters
    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }
}
