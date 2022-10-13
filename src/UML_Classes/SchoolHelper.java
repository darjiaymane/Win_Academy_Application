package UML_Classes;

import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SchoolHelper {
    static Scanner scan = new Scanner(System.in);

    public static void addSchool(){

            System.out.println(MenuHandler.symboleDecor + "Add School" + MenuHandler.symboleDecor + "\n\n");

            System.out.println("\sEnter the School name:\n");
            String name = scan.nextLine();

            System.out.println("\sEnter School WebSite:\n");
            String webSite = scan.nextLine();

            School school = new School(name, webSite);
            displaySchool(school.getId());

    }

    public static int searchSchool(){
        System.out.println("\s\s\sEnter the school Id");
        int info = scan.nextInt();
        scan.nextLine();
        Optional<School> optionalSchool= School.schoolHashMap.keySet().stream()
                .filter(k-> School.schoolHashMap.get(k).getId() == info).map(k->School.schoolHashMap.get(k)).findFirst();


        if (optionalSchool.isPresent()){
            displaySchool(optionalSchool.get().getId());
            return info;
        }else{
            System.out.println("School not found");
            return 0;
        }
    }

    public static void updateSchoolName(int schoolId) throws InterruptedException {
        String nameBefore = School.schoolHashMap.get(schoolId).getSchoolName();
        System.out.println("Enter The new School Name:");
        String name = scan.nextLine();

        School.schoolHashMap.get(schoolId).setSchoolName(name);

        System.out.println("The School has been updated successfully");
        System.out.println("The School name before update : " + nameBefore);
        System.out.println("The School name after updated : " + School.schoolHashMap.get(schoolId).getSchoolName());

        TimeUnit.SECONDS.sleep(1);
    }

    public static void updateSchoolWebSite(int schoolId) throws InterruptedException {
        String webSiteBefore = School.schoolHashMap.get(schoolId).getWebSite();

        System.out.println("Enter The new Website:");
        String webSite = scan.nextLine();

        School.schoolHashMap.get(schoolId).setWebSite(webSite);

        System.out.println("The School has been updated successfully");
        System.out.println("WebSite before update : " + webSiteBefore);
        System.out.println("website after updated : " + School.schoolHashMap.get(schoolId).getWebSite());

        TimeUnit.SECONDS.sleep(1);
    }

    public static void deleteSchool() {
        int schoolId= searchSchool();
        if (schoolId != 0 ) {
            School.schoolHashMap.remove(schoolId);
            System.out.println("The School has been deleted successfully");
        }
    }

    public static void displayAllSchool(){
        /*int counter = 0;
        for (int id : School.schoolHashMap.keySet()){
            System.out.println("ID " + School.schoolHashMap.get(id).getId());
            System.out.println("Name " + School.schoolHashMap.get(id).getSchoolName());
            System.out.println("Website: " + School.schoolHashMap.get(id).getWebSite());
            School.schoolHashMap.get(id).getDepartements().stream().forEach(s -> System.out.println("Departement :" +counter+":"+s.getDepartementName()));
            System.out.println("\s\s\s\s\s**************");
        }*/
        System.out.println("------------------");
        School.schoolHashMap.values().forEach(c->System.out.println("ID: "+c.getId()+"\n"+"Name: "+c.getSchoolName()+"\n"+"Website: "+c.getWebSite()+"\n"+"Departments: "+c.getDepartements()+"\n"));
        System.out.println("------------------");

    }
    public static void displaySchool(int id){
        System.out.println("id: " + School.schoolHashMap.get(id).getId());
        System.out.println("Name: " + School.schoolHashMap.get(id).getSchoolName());
        System.out.println("Website: " +School.schoolHashMap.get(id).getWebSite());
    }
}
