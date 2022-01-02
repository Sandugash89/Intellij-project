package class25.task3;

import java.util.Locale;

public class Registration {
     /*Create Registration Class in which you would have variables as email, userName and password that have an access
    scope only within its own class. After creating an object of the class user should be able to call methods and in
    each method separately pass values to set users email, username and password.
    Requirements:
    Valid email consider to be only yahoo
    Valid userName and password cannot be empty and should be of length larger than 6 characters.
    Also valid password cannot contain userName.*/

    private String email;
    private String userName;
    private String pass;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.toLowerCase().contains("yahoo")) {
            this.email = email;
        } else {
            System.out.println("not valid email");
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName.length() <= 6) {
            System.out.println("not valid userName");
        } else {
            this.userName = userName;
        }
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        if (pass.contains(userName)) {
            System.out.println("Pass not valid");
        } else {
            this.pass = pass;

        }
    }
}

