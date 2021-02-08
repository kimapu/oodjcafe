package domain;

public class Login {

    private final String USER = "admin";
    private final String PWD = "admin";
    
    private String username, password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public boolean verify(){
        return username.equals(USER) && password.equals(PWD);
    }
    
}
