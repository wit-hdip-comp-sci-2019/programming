import java.util.Scanner;

/**
 * This class asks the user to enter their name, address, age and date of birth.
 * The entered data is then printed out to the user.
 *
 * @author (WIT)
 * @version (1.0)
 */

public class Driver {

    private Scanner sc = new Scanner(System.in);
    private User user;

    public static void main(String[] arg) {

        Driver app = new Driver();
        app.addUser();
        app.printUser();
    }

    private void addUser() {
        //obtaining the data from the user
        System.out.println("Entering details");
        System.out.println("----------------");
        System.out.print("   Enter your name:          ");
        String name = sc.nextLine();
        System.out.print("   Enter your address:       ");
        String address = sc.nextLine();
        System.out.print("   Enter your date of birth: ");
        String dateOfBirth = sc.nextLine();
        System.out.print("   Enter your height         ");
        double height = sc.nextDouble();
        System.out.println();

        user = new User(name, address, dateOfBirth, height);
    }

    private void printUser()
    {
        //printing out the data to the user
        System.out.println("\n\nPrinting details");
        System.out.println("----------------");
        System.out.println(user);
    }

}

