import java.util.Scanner;

/**
* This class displays a basic menu for the Shop.
* 
* @author Mairead, Siobhan
*/

public class Driver
{
    private Scanner input;
    private Store store;
    
    public Driver()
    {
        input = new Scanner(System.in);        
        store = new Store("Waterford");
        runMenu();
    }
    
    /**
     * Starts the application
     * @param args
     */
    public static void main (String args[]){
    	Driver app = new Driver();
    }
    
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
        System.out.println("  3) Update a Product");        
        System.out.println("  4) Delete a Product"); 
        System.out.println("---------");     
        System.out.println("  5) List the cheapest product");        
        System.out.println("  6) List the products in our current product line"); 
        System.out.println("  7) Display average product unit cost"); 
        System.out.println("  8) List products that are more expensive than a given price");     
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
    
    public void addProduct()
    {
    	System.out.print("Please enter the product description: ");
    	String desc = input.nextLine();
    	desc = input.nextLine();
    	System.out.print("Please enter the product code: ");
    	int code = input.nextInt();
    	System.out.print("Please enter the product cost: ");
    	double cost = input.nextDouble();
    	System.out.print("Is this product in your current line (y/n): ");
    	char currentProduct = input.next().charAt(0);
    	boolean inCurrentProductLine = false;
    	if ((currentProduct == 'y') || (currentProduct == 'Y'))
    		inCurrentProductLine = true;
    	store.add(new Product(desc, code, cost, inCurrentProductLine ));
}
  
    
    public void editProduct()
    {
        //list the products and ask the user to choose the product to edit
    	System.out.println(store.listProducts());
   
    	if (store.getProducts().size() != 0){	
    		//only process the update if products exist in the ArrayList
    		System.out.print("Index of product to edit ==>");
    		int index = input.nextInt();
    		
    		if (index < store.getProducts().size()){	
    			//if the index number exists in the ArrayList, gather the new details from the user
    			System.out.print("   Enter a new product description: ");
    			String desc = input.nextLine();
    			desc = input.nextLine();
    			System.out.print("   Enter a new product code: ");
    			int code = input.nextInt();
    			System.out.print("   Enter a new product cost: ");
    			double cost = input.nextDouble();
    			System.out.print("   Is this product in your current line (y/n): ");
    			char currentProduct = input.next().charAt(0);
    			boolean inCurrentProductLine = false;
    			if ((currentProduct == 'y') || (currentProduct == 'Y'))
    				inCurrentProductLine = true;
    	
    			//retrieve the product from the ArrayList and update the details with the user input
    			Product product = store.getProducts().get(index);
    			product.setProductName(desc);
    			product.setProductCode(code);
    			product.setUnitCost(cost);
    			product.setInCurrentProductLine(inCurrentProductLine);
    		}
    		else
            {
            	System.out.println("There is no product for this index number");
            }
        }
    } 
    
    public void deleteProduct()
    {
        //list the products and ask the user to choose the product to edit
    	System.out.println(store.listProducts());
   
    	if (store.getProducts().size() != 0){	
    		//only process the delete if products exist in the ArrayList
    		System.out.print("Index of product to delete ==>");
    		int index = input.nextInt();
    		
    		if (index < store.getProducts().size()){	
    			//if the index number exists in the ArrayList, delete it from the ArrayList
    			store.getProducts().remove(index);
    			System.out.println("Product deleted.");
    		}
    		else
            {
            	System.out.println("There is no product for this index number");
            }
        }
    } 
    
 }
