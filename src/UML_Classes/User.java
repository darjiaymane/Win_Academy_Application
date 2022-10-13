package UML_Classes;

import java.util.HashMap;

public class User {

    public static HashMap<Integer, User> usersMap = new HashMap<Integer, User>();
    private int id;
    private String name;
    private String phoneNumber;
    private String mailAddress;
    private String password;
    private String role;

    private boolean status;

    private static int counter = 0;


    /*
    Constructor
     */
     User(String name, String phoneNumber, String mailAddress, String password, String role, boolean status) {
        this.id = ++counter;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.mailAddress = mailAddress;
        this.password = password;
        this.role = role;
        this.status = status;

        usersMap.put(this.id, this);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFk_role() {
        return role;
    }

    public void setFk_role(String role) {
        this.role = role;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
