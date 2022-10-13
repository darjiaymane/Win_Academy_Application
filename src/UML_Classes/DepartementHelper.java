package UML_Classes;
import java.util.Scanner;
public class DepartementHelper {
    static Scanner scan = new Scanner(System.in);

    public static void addDepartement(int schoolId){
        System.out.println(MenuHandler.symboleDecor + "Add Departement" + MenuHandler.symboleDecor + "\n\n");
        System.out.println("\sEnter the Departement name:\n");
        String name = scan.nextLine();

        Departement departement = new Departement(name);
        School.schoolHashMap.get(schoolId).setDepartements(departement);
    }
}
