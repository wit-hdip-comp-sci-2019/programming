import java.util.Scanner;

/**
 * This class runs the application and handles the Product I/O
 *  
 * @author Siobhan Drohan, Mairead Meagher
 * @version 1.0
 */
public class Driver{
	private Scanner input;
    private Store store;

    public static void main(String[] args) {
		Driver c = new Driver();
		c.processOrder();
		c.printProduct();
	}
    
    public Driver(){
        input = new Scanner(System.in);        
    }
    
    private void processOrder(){
    	//find out from the user how many products they would like to order
    	System.out.print("How many Products would you like to have in your Store?  ");
    	int numberProducts = input.nextInt();
    	
    	store = new Store(numberProducts);

    	//ask the user for the details of the products and add them to the order
    	for (int i = 0; i < numberProducts; i++){
            addProduct();
    	}
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
    
    //print the product (the toString method is automatically called).
    private void printProduct(){
    	System.out.println(store.listProducts());
    }
	   	
}