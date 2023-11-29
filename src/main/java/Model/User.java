package Model;

public class User {
    private String userName;
    private String Password;
    private String type;

    public User(String userName, String password, String type) {
        this.userName = userName;
        Password = password;
        this.type = type;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return Password;
    }

    public String getType() {
        return type;
    }
}
