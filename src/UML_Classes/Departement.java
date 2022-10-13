package UML_Classes;

import java.util.ArrayList;

public class Departement {
    private int id;
    private String departementName;
    private int counter= 0;
    private final ArrayList<Teacher> teachers = new ArrayList<>();

    public Departement(String departementName) {
        this.id = counter++;
        this.departementName = departementName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartementName() {
        return departementName;
    }

    public void setDepartementName(String departementName) {
        this.departementName = departementName;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher teacher){
        this.teachers.add(teacher);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", departementName='" + departementName + '\'' +
                '}';
    }
}
