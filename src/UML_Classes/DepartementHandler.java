package UML_Classes;

import java.util.Scanner;

public class DepartementHandler {

    static Scanner scan = new Scanner(System.in);
    public static void DepartementMenu(){
        int menuOption;

        do{
            System.out.println(MenuHandler.symboleDecor+"Welcome to Departement menu"+MenuHandler.symboleDecor+"*\n*\n*\n*");
            System.out.println("*\s\s\s\s\s\s1. Add a Departement");
            System.out.println("*\s\s\s\s\s\s2. Update a Departement");
            System.out.println("*\s\s\s\s\s\s3. Delete a Departement");
            System.out.println("*\s\s\s\s\s\s4. Search a Departement");
            System.out.println("*\s\s\s\s\s\s5. Display All Departements");
            System.out.println("*\s\s\s\s\s\s0. Go Back to the main menu");
            menuOption = scan.nextInt();
            scan.nextLine();

            CallCrudFunctions(menuOption);
        }while(menuOption !=0);
    }




    public static void CallCrudFunctions(int menuChoice) {

        switch(menuChoice){
            case 1:
                int schoolId= SchoolHelper.searchSchool();
                if( schoolId != 0){
                    DepartementHelper.addDepartement(schoolId);
                }
                break;
            case 2:
                break;
            default:
                break;

        }
    }

}




