package UML_Classes;

import java.util.HashMap;
import java.util.Map;

public class Teacher extends User{

    public static Map<Integer, Teacher> teachersMap = new HashMap<>();

    private String fonctionDate;

    Teacher(String name, String phoneNumber, String mailAddress, String password, String role, boolean status, String fonctionDate) {
        super(name, phoneNumber, mailAddress, password, role, status);
        this.fonctionDate = fonctionDate;
        teachersMap.put(this.getId(), this);
    }

    public String getFonctionDate() {
        return fonctionDate;
    }

    public void setFonctionDate(String fonctionDate) {
        this.fonctionDate = fonctionDate;
    }
}
