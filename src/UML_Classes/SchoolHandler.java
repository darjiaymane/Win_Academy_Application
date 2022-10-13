package UML_Classes;

import java.util.Scanner;

public class SchoolHandler {
    static Scanner scan = new Scanner(System.in);
    public static void SchoolMenu() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int menuOption;

        do{
            System.out.println(MenuHandler.symboleDecor+"Welcome to School menu"+MenuHandler.symboleDecor+"*\n*\n*\n*");
            System.out.println("*\s\s\s\s\s\s1. Add a School");
            System.out.println("*\s\s\s\s\s\s2. Update a School");
            System.out.println("*\s\s\s\s\s\s3. Delete a School");
            System.out.println("*\s\s\s\s\s\s4. Search a School");
            System.out.println("*\s\s\s\s\s\s5. Display All Schools");
            System.out.println("*\s\s\s\s\s\s0. Go Back to the main menu");
            menuOption = scan.nextInt();
            scan.nextLine();

            CallCrudFunctions(menuOption);
        }while(menuOption !=0);
    }

    public static void CallCrudFunctions(int menuChoice) throws InterruptedException {

            switch(menuChoice){
                case 1:
                    SchoolHelper.addSchool();
                    break;
                case 2:
                    int schoolId= SchoolHelper.searchSchool();
                    if( schoolId != 0){
                        System.out.println(schoolId);
                        userUpdateMenu(schoolId);
                    }
                    break;
                case 3:
                    SchoolHelper.deleteSchool();
                    break;
                case 4:
                    SchoolHelper.searchSchool();
                    break;
                case 5:
                    SchoolHelper.displayAllSchool();
                    break;
                case 0:
                    break;
            }
        }
    public static void userUpdateMenu(int schoolId) throws InterruptedException {
        int menuOption;

            System.out.println(MenuHandler.symboleDecor+"Welcome to School Update menu"+MenuHandler.symboleDecor+"*\n*\n*\n*");

            System.out.println("\s\s\s\s1. Update the School Name");
            System.out.println("\s\s\s\s2. Update the School webSite");
            System.out.println("\s\s\s\s0. Go back");

            menuOption = scan.nextInt();
            scan.nextLine();
            CallUpdateFunctions(menuOption, schoolId);
    }

    public static void CallUpdateFunctions(int menuChoice, int schoolId) throws InterruptedException {

        switch(menuChoice){
            case 1:
                SchoolHelper.updateSchoolName(schoolId);
                break;
            case 2:
                SchoolHelper.updateSchoolWebSite(schoolId);
                break;
            case 0:
                break;
        }
    }
}


