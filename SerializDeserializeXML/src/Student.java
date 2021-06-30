
public enum Student {
    INSTANCE;
    public String username;
    public String email;
    public String password;

    public void printInfo() {
        System.out.println("username = " + this.username);
        System.out.println("email = " + this.email);
        System.out.println("password = " + this.password);
    }

    public String getUsername() {
        return this.username;
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
