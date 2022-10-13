package UML_Classes;

import java.util.ArrayList;
import java.util.HashMap;

public class School {
    public static HashMap<Integer, School> schoolHashMap = new HashMap<>();
    private int id;
    private String schoolName;
    private String webSite;
    private final ArrayList<Departement> departements = new ArrayList<>();


    public static int counter = 0;

    public School(String schoolName, String webSite) {
        this.id = ++counter;
        this.schoolName = schoolName;
        this.webSite = webSite;
        schoolHashMap.put(this.id, this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getSchoolName() {

        return schoolName;
    }

    public void setSchoolName(String schoolName) {

        this.schoolName = schoolName;
    }

    public String getWebSite() {

        return webSite;
    }

    public void setWebSite(String webSite) {

        this.webSite = webSite;
    }

    public ArrayList<Departement> getDepartements() {
        return departements;
    }

    public void setDepartements( Departement departement) {
        this.departements.add(departement);
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", schoolName='" + schoolName + "\n" +
                ", webSite='" + webSite + "\n" +
                ", departements=" + departements +
                '}';
    }
}
