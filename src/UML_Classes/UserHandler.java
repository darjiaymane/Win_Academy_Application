package UML_Classes;

import java.util.Scanner;

public class UserHandler {

    static Scanner scan = new Scanner(System.in);
    public static void userMenu(String userRole) throws InterruptedException {
        int menuOption;
        do {
            System.out.println(MenuHandler.symboleDecor+"Welcome to "+userRole+" menu"+MenuHandler.symboleDecor+"*\n*\n*\n*");
            System.out.println("\s\s\s\s1. Add a "+ userRole);
            System.out.println("\s\s\s\s2. Update a "+ userRole);
            System.out.println("\s\s\s\s3. Delete a "+ userRole);
            System.out.println("\s\s\s\s4. Search a "+ userRole);
            System.out.println("\s\s\s\s5. Display All "+ userRole);
            System.out.println("\s\s\s\s0. Go Back to the main menu");

            menuOption = scan.nextInt();
            scan.nextLine();
            CallCrudFunctions(menuOption, userRole);
        }while(menuOption !=0);


    }

    public static void CallCrudFunctions(int menuChoice,String userRole) throws InterruptedException {

        switch(menuChoice){
            case 1:
                if (userRole.equals("Teacher")){
                    int schoolId= SchoolHelper.searchSchool();
                    if( schoolId != 0){
                        UserHelper.addUser(userRole);
                    }
                }else {
                    UserHelper.addUser(userRole);
                }
                break;
            case 2:
                int userId= UserHelper.searchUser(userRole);

                if( userId != 0){
                    userUpdateMenu(userRole, userId);
                }
                break;

            case 3:
                UserHelper.deleteUser(userRole);
                break;
            case 4:
                UserHelper.searchUser(userRole);
                break;
            case 5:
                break;
            case 0:
                break;
        }
    }


    public static void userUpdateMenu(String userRole, int userId) throws InterruptedException {
        int menuOption;
        do {
            System.out.println(MenuHandler.symboleDecor+"Welcome to "+userRole+" menu"+MenuHandler.symboleDecor+"*\n*\n*\n*");
            System.out.println("\s\s\s\s1. Update the Name");
            System.out.println("\s\s\s\s2. Update the Phone number");
            System.out.println("\s\s\s\s3. Update the Email address");
            System.out.println("\s\s\s\s4. Update the Password");
            System.out.println("\s\s\s\s5. Update the Status");
            System.out.println("\s\s\s\s0. Go Back to the"+userRole+"menu");

            menuOption = scan.nextInt();

            CallUpdateFunctions(menuOption, userId);
        }while(menuOption !=0);
    }

    public static void CallUpdateFunctions(int menuChoice, int userId) throws InterruptedException {

        switch(menuChoice){
            case 1:
                UserHelper.updateName(userId);
                break;
            case 2:
                //UserHelper.updateUser(userRole);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 0:
                break;
        }
    }



}
