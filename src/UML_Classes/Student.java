package UML_Classes;

import java.util.HashMap;
import java.util.Map;

public class Student extends User{

    public static Map<Integer, Student> studentsMap = new HashMap<>();
    private String startDate;

    Student(String name, String phoneNumber, String mailAddress, String password, String role, boolean status, String startDate) {
        super(name, phoneNumber, mailAddress, password, role, status);
        this.startDate = startDate;
        studentsMap.put(this.getId(),this);
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }


}
