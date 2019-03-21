import java.util.Scanner;

/**
 * This class runs the application and handles the Store with its Products.
 *  
 * @author Siobhan Drohan, Mairead Meagher
 */
public class Driver{
	private Scanner input;
    private Store store;

    public static void main(String[] args) {
		Driver app = new Driver();
	}
    
    public Driver(){
        input = new Scanner(System.in);
        store = new Store();
        runMenu();
    }
    
//    private void processOrder(){
//        //find out from the user how many products they would like to order
//        System.out.print("How many Products would you like to have in your Store?  ");
//        int numberProducts = input.nextInt();
//        
//
//    	//ask the user for the details of the products and add them to the order
//    	for (int i = 0; i < numberProducts; i++){
//            addProduct();
//            System.out.println();
//    	}
//    }
    
    /**
     * mainMenu() - This method displays the menu for the application, 
     * reads the menu option that the user entered and returns it.
     * 
     * @return     the users menu choice
     */
    private int mainMenu()
    { 
        System.out.println("Shop Menu");
        System.out.println("---------");     
        System.out.println("  1) Add a Product");    
        System.out.println("  2) List the Products");    
        System.out.println("---------");     
        System.out.println("  3) List the cheapest product");        
        System.out.println("  4) List the products in our current product line"); 
        System.out.println("  5) Display average product unit cost"); 
        System.out.println("  6) List products that are more expensive than a given price");     
        System.out.println("  0) Exit");
        System.out.print("==>> ");
        int option = input.nextInt();
        return option;
    }

    
    /**
     * This is the method that controls the loop.
     */
   private void runMenu()
   {
       int option = mainMenu();
       while (option != 0)
       {
          
           switch (option)
           {
              case 1:    addProduct();
           	             break;
              case 2:    System.out.println(store.listProducts());
                         break;
              case 3:    System.out.println(store.cheapestProduct());
                         break;
              case 4:    System.out.println(store.listCurrentProducts());
                         break;
              case 5:    System.out.println(store.averageProductPrice());
                         break;
              case 6:    System.out.print("Enter the price barrier: ");
                         double price = input.nextDouble();
                         System.out.println(store.listProductsAboveAPrice(price));
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
        //dummy read of String to clear the buffer - bug in Scanner class.
    	input.nextLine();
    	System.out.print("Enter the Product Name:  ");
        String productName = input.nextLine();
        System.out.print("Enter the Product Code:  ");
        int productCode = input.nextInt();
        System.out.print("Enter the Unit Cost:  ");
        double unitCost = input.nextDouble();
    	System.out.print("Is this product in your current line (y/n): ");
       	char currentProduct = input.next().charAt(0);
    	boolean inCurrentProductLine = false;
    	if ((currentProduct == 'y') || (currentProduct == 'Y'))
    		inCurrentProductLine = true;
    	
    	store.add(new Product(productName, productCode, unitCost, inCurrentProductLine));
    }
    
}