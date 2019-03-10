import java.util.Scanner;

/**
 * This class runs the application and handles the Product I/O
 * @version 1.0
 */
public class Driver{

    private Scanner input = new Scanner(System.in);
    private Product product;

    public static void main(String[] args) {
		Driver c = new Driver();
		c.addProduct();
		c.printProduct();
	}

    //gather the product data from the user and create a new product.
    private void addProduct(){
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
    	
        product = new Product(productName, productCode, unitCost, inCurrentProductLine);
    }
    
    //print the product (the toString method is automatically called).
    private void printProduct(){
    	System.out.println(product);
    }
	   	
}