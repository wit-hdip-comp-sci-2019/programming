import java.util.ArrayList;

public class Store {

	private ArrayList<Product> products;

	public Store(){
		products = new ArrayList<Product>();
	}

	public void add (Product product){
        products.add (product); 
    }

    public ArrayList<Product> getProducts()
    {
    	return products;
    }
    
//	public String listProducts(){
//		if (products.size() == 0){
//			return "No products";
//		}
//		else{
//			String listOfProducts = "";
//			for (int i = 0; i < products.size(); i++){
//				listOfProducts = listOfProducts + i + ": " + products.get(i) + "\n";
//			}
//			return listOfProducts;
//		} 
//	}
	
	public String listProducts(){
		if (products.size() == 0){
			return "No products";
		}
		else{
			String listOfProducts = "";
			int index = 0;
			for (Product product : products){
				listOfProducts = listOfProducts + index + ": " + product + "\n";
				index ++;
			}
			return listOfProducts;
		} 
	}

	public String listCurrentProducts(){
		if (products.size() == 0){
			return "No products are in our current product line";
		}
		else{
			String listOfProducts = "";
			for (int i = 0; i < products.size(); i++){
	           if (products.get(i).isInCurrentProductLine())            
  				  listOfProducts = listOfProducts + i + ": " + products.get(i) + "\n";
			}
			return listOfProducts;
		} 
	}
	
	public String listProductsAboveAPrice(double price)
	{
		String str = "";    
		for (int i = 0; i < products.size(); i++){
			if (products.get(i).getUnitCost() > price)
				str = str + i + ": " + products.get(i) + "\n";
		}
		
		if (str.equals(""))
			return "No Products are more expensive than: " + price;
		else
			return str;	
	}    

	public double averageProductPrice()
	{ 
		if (products.size() > 0){
			double totalPrice = 0;
			for (int i = 0; i < products.size(); i++){
				totalPrice = totalPrice + products.get(i).getUnitCost();
			}
			return toTwoDecimalPlaces(totalPrice / products.size());
		}
		else{
			return 0.0;
		}
	}
	
	public String cheapestProduct()
	{
		if (products.size() > 0){
			Product cheapestProduct = products.get(0);
			for (Product product : products){
				if (product.getUnitCost() < cheapestProduct.getUnitCost() )  
					cheapestProduct = product;
			}
			return cheapestProduct.getProductName();
		}
		else 
			return "No Products added to the ArrayList";
	} 

	private double toTwoDecimalPlaces(double num){
        return (int) (num *100 ) /100.0; 
    }

}
