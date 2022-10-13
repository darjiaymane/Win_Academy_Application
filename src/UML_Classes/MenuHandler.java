package UML_Classes;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class MenuHandler {
    static String symboleDecor="************************************************";

    public static int displayMenu() throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        System.out.println(symboleDecor+"Welcome to win Academy"+symboleDecor+"*\n*\n*\n*");

        System.out.println("\s\s\s\s\s1. Manage Schools");
        System.out.println("\s\s\s\s\s2. Manage Departments");
        System.out.println("\s\s\s\s\s3. Manage Teachers");
        System.out.println("\s\s\s\s\s4. Manage Students");
        System.out.println("\s\s\s\s\s5. Manage Subjects");
        System.out.println("\s\s\s\s\s6. Manage Classes");
        System.out.println("\s\s\s\s\s0. LogOut");
        System.out.println("\n");
        System.out.print("\s\s\s\s\sEnter your choice:  ");
        int menuOption = scan.nextInt();
        redirectUser(menuOption);

        return menuOption;
    }

    public static void redirectUser(int menuOption) throws InterruptedException {

        switch (menuOption) {
            case 1 -> SchoolHandler.SchoolMenu();
            case 2 -> DepartementHandler.DepartementMenu();
            case 3 -> UserHandler.userMenu("Teacher");
            case 4 -> UserHandler.userMenu("Student");
            case 0 -> {
                System.out.println("Exit the system");
                TimeUnit.SECONDS.sleep(3);
                System.exit(0);
            }
            default -> {
                System.out.println("\n\n\n\s\s\s\s\s\sChoose a valid number :");
                TimeUnit.SECONDS.sleep(3);
            }
        }
    }
}
