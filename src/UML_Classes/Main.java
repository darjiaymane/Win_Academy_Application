package UML_Classes;


public class Main {


    public static void main(String[] args) throws InterruptedException {
        int menuChoice;
        do {
            //clearScreen();
            menuChoice = MenuHandler.displayMenu();

        } while (menuChoice != 0);
    }

    /*public  static void clearScreen(){
        try{
            String operatingSystemName = System.getProperty("os.name");
            //System.out.println("system name:"+operatingSystemName);
            if(operatingSystemName.contains("Windows")){
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }*/
}