import java.util.Scanner;

/**
 * This class runs the application and handles the Product I/O
 * @version 3.0
 */
public class Driver{

    private Scanner input = new Scanner(System.in);
    private Store store;

    public static void main(String[] args) {
        Driver c = new Driver();
    }

    public Driver()
    {
        store = new Store();
        runMenu();
    }

    /**
     * mainMenu() - This method displays the menu for the application,
     * reads the menu option that the user entered and returns it.
     *
     * @return     the users menu choice
     */
    private int mainMenu(){
        System.out.println("Shop Menu");
        System.out.println("---------");
        System.out.println("  1) Add a Product");
        System.out.println("  2) List the Products");
        System.out.println("  3) Update a Product");
        System.out.println("  4) Delete a Product");
        System.out.println("---------");
        System.out.println("  5) List the cheapest product");
        System.out.println("  6) List the products in our current product line");
        System.out.println("  7) Display average product unit cost");
        System.out.println("  8) List products that are more expensive than a given price");
        System.out.println("---------");
        System.out.println("  9) Save Products to products.xml");
        System.out.println("  10) Load Products from products.xml");
        System.out.println("  0) Exit");

        int option = 0;
        boolean goodInput = false; 	//Loop  Control Variable
        do {
            try {
                System.out.print("==>> ");
                option = input.nextInt();
                goodInput = true;
            }
            catch (Exception e) {
                input.nextLine();  //swallows Scanner bug
                System.out.println("Num expected - you entered  text");
            }
        }  while (!goodInput);

        return option;
    }

    private void runMenu(){
        int option = mainMenu();
        while (option != 0){

            switch (option){
                case 1:    addProduct();
                    break;
                case 2:    System.out.println(store.listProducts());
                    break;
                case 3:    editProduct();
                    break;
                case 4:    deleteProduct();
                    break;
                case 5:    System.out.println(store.cheapestProduct());
                    break;
                case 6:    System.out.println(store.listCurrentProducts());
                    break;
                case 7:    System.out.println(store.averageProductPrice());
                    break;
                case 8:    System.out.print("Enter the price barrier: ");
                    double price = input.nextDouble();
                    System.out.println(store.listProductsAboveAPrice(price));
                    break;
                case 9:
                    try{
                        store.save();
                    }
                    catch(Exception e){
                        System.err.println("Error writing to file: " + e);
                    }
                    break;
                case 10:
                    try{
                        store.load();
                    }
                    catch(Exception e){
                        System.err.println("Error loading from file: " + e);
                    }
                    break;
                default:    System.out.println("Invalid option entered: " + option);
                    break;
            }

            //pause the program so that the user can read what we just printed to the terminal window
            System.out.println("\nPress any key to continue...");
            input.nextLine();
            input.nextLine();  //this second read is required - bug in Scanner class; a String read is ignored straight after reading an int.

            //display the main menu again
            option = mainMenu();
        }

        //the user chose option 0, so exit the program
        System.out.println("Exiting... bye");
        System.exit(0);
    }

    //gather the product data from the user and create a new product.
    private void addProduct(){
        input.nextLine();  //dummy read of String to clear the buffer - bug in Scanner class.
        System.out.print("Enter the Product Name:  ");
        String productName = input.nextLine();

        int productCode = 0;
        boolean goodInput = false; 	//Loop  Control Variable
        do {
            try {
                System.out.print("Enter the product code: ");
                productCode = input.nextInt();
                goodInput = true;
            }
            catch (Exception e) {
                input.nextLine();  //swallows Scanner bug
                System.out.println("Num expected - you entered  text");
            }
        }  while (!goodInput);


        double unitCost = 0;
        goodInput = false; 	//Loop  Control Variable
        do {
            try {
                System.out.print("Enter the Unit Cost:  ");
                unitCost = input.nextDouble();
                goodInput = true;
            }
            catch (Exception e) {
                input.nextLine();  //swallows Scanner bug
                System.out.println("Num expected - you entered  text");
            }
        }  while (!goodInput);


        System.out.print("Is this product in your current line (y/n): ");
        char currentProduct = input.next().charAt(0);
        boolean inCurrentProductLine = false;
        if ((currentProduct == 'y') || (currentProduct == 'Y'))
            inCurrentProductLine = true;

        store.add(new Product(productName, productCode, unitCost, inCurrentProductLine));
    }

    private void editProduct(){
        //list the products
        System.out.println(store.listProducts());

        if (store.getProducts().size() > 0) {
            //only ask the user to choose a product if products exist
            System.out.print("Enter the index of the product to update ==> ");
            int index = input.nextInt();

            if ((index >= 0) && (index < store.getProducts().size())) {
                //if the index is valid, gather new details for each field from the user
                input.nextLine();  //dummy read of String to clear buffer - bug in Scanner.
                System.out.print("Enter the Product Name:  ");
                String productName = input.nextLine();

                int productCode = 0;
                boolean goodInput = false; 	//Loop  Control Variable
                do {
                    try {
                        System.out.print("Enter the product code: ");
                        productCode = input.nextInt();
                        goodInput = true;
                    }
                    catch (Exception e) {
                        input.nextLine();  //swallows Scanner bug
                        System.out.println("Num expected - you entered  text");
                    }
                }  while (!goodInput);


                double unitCost = 0;
                goodInput = false; 	//Loop  Control Variable
                do {
                    try {
                        System.out.print("Enter the Unit Cost:  ");
                        unitCost = input.nextDouble();
                        goodInput = true;
                    }
                    catch (Exception e) {
                        input.nextLine();  //swallows Scanner bug
                        System.out.println("Num expected - you entered  text");
                    }
                }  while (!goodInput);


                System.out.print("Is this product in your current line (y/n): ");
                char currentProduct = input.next().charAt(0);
                boolean inCurrentProductLine = false;
                if ((currentProduct == 'y') || (currentProduct == 'Y'))
                    inCurrentProductLine = true;

                //retrieve the selected product from the ArrayList and update the details
                Product product = store.getProducts().get(index);
                product.setProductCode(productCode);
                product.setProductName(productName);
                product.setUnitCost(unitCost);
                product.setInCurrentProductLine(inCurrentProductLine);
            }
            else {
                System.out.println("There are no products for this index number");
            }
        }
    }

    private void deleteProduct(){
        //list the products
        System.out.println(store.listProducts());

        if (store.getProducts().size() > 0) {
            //only ask the user to choose the product to delete if products exist
            System.out.print("Enter the index of the product to delete ==> ");
            int index = input.nextInt();

            if ((index >= 0) && (index < store.getProducts().size())) {
                //if the index is valid, delete the product at the given index
                store.getProducts().remove(index);
                System.out.println("Product deleted.");
            }
            else{
                System.out.println("There is no product for this index number");
            }
        }
    }
}