import java.io.Serializable;

public class Student {
    private String username;
    private String email;
    private String password;

    public Student() {
    }

    public Student(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public void printInfo() {
        System.out.println("username = " + this.username);
        System.out.println("email = " + this.email);
        System.out.println("password = " + this.password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
