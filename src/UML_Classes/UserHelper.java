package UML_Classes;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class UserHelper {
    static Scanner scan = new Scanner(System.in);

    public static void addUser(String role) throws InterruptedException {

        boolean status = false;


        System.out.println(MenuHandler.symboleDecor + "Add User" + MenuHandler.symboleDecor + "\n\n");

        System.out.println("\sEnter the user name:\n");
        String name = scan.nextLine();

        System.out.println("\sEnter the user Phone number:\n");
        String phone = scan.nextLine();
        System.out.println("\sEnter the user email address:\n");
        String email = scan.nextLine();
        System.out.println("\sEnter the user password:\n");
        String password = scan.nextLine();
        System.out.println("\sEnter the user Status:\n");
        System.out.println("\s1: Activated");
        System.out.println("\s0: Desactivated");
        int statusNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("\sEnter the entry date:\n");
        String entryDate = scan.nextLine();


        if (statusNumber == 1) {
            status = true;
        }


        if (role.equals("Student")) {
            Student student = new Student(name, phone, email, password, role, status, entryDate);
            displayUser(student.getId());
        }
        if (Objects.equals(role, "Teacher")) {
            Teacher teacher = new Teacher(name, phone, email, password, role, status, entryDate);
            displayUser(teacher.getId());
        }

    }

    public static void updateName(int userId) throws InterruptedException {
        String nameBefore = User.usersMap.get(userId).getName();

        System.out.println("Enter The Name:");
        String name = scan.nextLine();

        User.usersMap.get(userId).setName(name);

        System.out.println("The User has been updated successfully");
        System.out.println("Name before update : " + nameBefore);
        System.out.println("The has been updated : " + User.usersMap.get(userId).getName());

        TimeUnit.SECONDS.sleep(1);
    }

    public static int searchUser(String userRole) throws InterruptedException {
        int userId = 0;

        System.out.println("\s\s\sEnter the "+userRole+" Phone number or email address:");
        String info = scan.nextLine();

        for (int id : User.usersMap.keySet()) {
            if (User.usersMap.get(id).getFk_role().equals(userRole)  && (User.usersMap.get(id).getPhoneNumber().equals(info) || User.usersMap.get(id).getMailAddress().equals(info))) {
                userId = id;
            }
        }
        if (userId != 0) {
            displayUser(userId);
            return userId;
        }
        else {
            System.out.println("There is no "+userRole+" with those informations \n\s\s\s!!!!!!!! please the check the phone number or the email address");
            return 0;
        }
    }

    public static void deleteUser(String userRole) throws InterruptedException {
        int userId = UserHelper.searchUser(userRole);
        if (userId != 0){
            User.usersMap.remove(userId);
            System.out.println("The "+userRole+" has been deleted successfully");
        }
    }

    public static void displayUser(int id) throws InterruptedException {

        System.out.println("User Id : " + User.usersMap.get(id).getId());
        System.out.println("User Name : " + User.usersMap.get(id).getName());
        System.out.println("User Phone number : " + User.usersMap.get(id).getPhoneNumber());
        System.out.println("User Email address : " + User.usersMap.get(id).getMailAddress());
        System.out.println("User Password : " + User.usersMap.get(id).getPassword());
        System.out.println("User Status : " + User.usersMap.get(id).getStatus());
        System.out.println("User Role : "+User.usersMap.get(id).getFk_role());
        TimeUnit.SECONDS.sleep(3);
    }


}
