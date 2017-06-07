package gq.kozachello.spring.home.model;

/**
 * Created by Козак on 29.05.2017.
 */

public class User {

    private int id;
    private String user;
    private String pass;

    public User(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public User() {} // default constructor

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

}
