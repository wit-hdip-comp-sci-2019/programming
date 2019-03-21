import java.util.Scanner;
/**
 * The Driver class is a menu driven application where the user can choose to
 * enter DVD titles (which are then stored as Strings in the dvds collection)
 * or display a list of all the DVD titles stored in the dvds collection.
 *
 * @version (16th Feb 2018)
 */

public class Driver
{
    private Library library;
    private Scanner input;

    /**
     * Constructor for objects of class Driver
     */
    public Driver()
    {
        library = new Library ();
        input = new Scanner(System.in);
    }


    public static void main(String args[])
    {
        Driver app = new Driver();
        app.run();
    }


    /**
     * mainMenu() - This method displays the menu for the application,
     * reads the menu option that the user entered and returns it.
     *
     * @return     the users menu choice
     */

    private int mainMenu()
    {
        System.out.println("My DVD Library");
        System.out.println("  1) Add a DVD");
        System.out.println("  2) List all DVDs");
        System.out.println("  3) Update a DVD");
        System.out.println("  4) Delete a DVD");
        System.out.println("  0) Exit");
        System.out.print("==>>");
        int option = input.nextInt();
        return option;
    }

    /**
     * run() - This method displays the menu and processes the user's menu
     * choice.  Option ‘0’ exits the program.  Option ‘1’ adds a DVD title to the
     * ArrayList dvds, and Option ‘2’ lists the DVD titles stored in the ArrayList.
     */
    private void run()
    {
        int option = mainMenu();
        while (option != 0)
        {
            switch (option)
            {
                case 1:
                     addDVD();
                     break;
                case 2:
                     System.out.println(library.listDVDs());
                     break;
                case 3:
                     updateDVD();
                     break;
                case 4:
                    deleteDVD();
                    break;
                default:
                     System.out.println("Invalid option selected.");
                     break;
            }

            //display the main menu again
            System.out.println("");
            option = mainMenu();
        }
        System.out.println("Exiting... bye");
    }

        // This method reads the title of the DVD from the user and
    // adds it to the dvds collection in Library.
    private void addDVD()
    {
        input.nextLine();  //dummy read to cater for the bug in scanner
        System.out.print("DVD title: ");
        String dvdTitle = input.nextLine();
        library.add(new DVD(dvdTitle));
    }

    private void updateDVD()
    {
        //list the DVDs and ask the user to choose the DVD to edit
        System.out.println(library.listDVDs());

        if (library.getDVDs().size() != 0){
            //only process the update if DVDs exist in the ArrayList
            System.out.print("Index of dvd to edit ==>");
            int index = input.nextInt();

            if ((index >= 0) && (index < library.getDVDs().size()))
            {
                //if the index number exists in the ArrayList, gather the new details from the user
                System.out.print("   Enter a new dvd title: ");
                String desc = input.nextLine();  //swallow scanner bug
                desc = input.nextLine();

                //retrieve the DVD from the ArrayList and update the details with the user input
                DVD dvd = library.getDVDs().get(index);
                dvd.setTitle(desc);
            }
            else
            {
                System.out.println("There is no DVD for this index number");
            }
        }
    }


    private void deleteDVD()
    {
        //list the DVDs and ask the user to choose the dvd to edit
        System.out.println(library.listDVDs());

        if (library.getDVDs().size() != 0){
            //only process the delete if DVDs exist in the ArrayList
            System.out.print("Index of DVD to delete ==>");
            int index = input.nextInt();

            if ((index >= 0) && (index < library.getDVDs().size()))
            {
                //if the index number exists in the ArrayList, delete it from the ArrayList
                library.getDVDs().remove(index);
                System.out.println("DVD deleted.");
            }
            else
            {
                System.out.println("There is no DVD for this index number");
            }
        }
    }

}
