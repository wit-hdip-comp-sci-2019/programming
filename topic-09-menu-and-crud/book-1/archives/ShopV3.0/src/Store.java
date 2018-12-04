import java.util.ArrayList;

public class Store {

    private ArrayList<Product> products;

    public Store() {
        products = new ArrayList<Product>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public String listProducts() {
        if (products.size() == 0) {
            return "No products";
        } else {
            String listOfProducts = "";
            for (int i = 0; i < products.size(); i++) {
                listOfProducts = listOfProducts + i + ": " + products.get(i) + "\n";
            }
            return listOfProducts;
        }
    }

    public String cheapestProduct() {
        if (products.size() != 0) {
            Product cheapestProduct = products.get(0);
            for (Product product : products) {
                if (product.getUnitCost() < cheapestProduct.getUnitCost())
                    cheapestProduct = product;
            }
            return cheapestProduct.getProductName();
        } else
            return "No Products are in the ArrayList";
    }

    // Note: in this method we opted to use the for-each loop as we didn't
    // need to return the index location of the objects.
    // Either the normal for loop, while loop or for-each loop would have worked here.
    public String listCurrentProducts() {
        if (products.size() == 0) {
            return "No products are currently in the product range.";
        } else {
            String listOfProducts = "";
            for (Product product : products) {
                if (product.isInCurrentProductLine())
                    listOfProducts += product + "\n";
            }
            return listOfProducts;
        }
    }

    public double averageProductPrice() {
        if (products.size() != 0) {
            double totalPrice = 0;
            for (int i = 0; i < products.size(); i++) {
                totalPrice = totalPrice + products.get(i).getUnitCost();
            }
            return toTwoDecimalPlaces(totalPrice / products.size());
        } else {
            return 0.0;
        }
    }

    public String listProductsAboveAPrice(double price) {
        if (products.size() != 0) {
            String str = "";
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getUnitCost() > price)
                    str += i + ": " + products.get(i) + "\n";
            }
            return str;
        } else {
            return "No Products are more expensive than: " + price;
        }

    }

    private double toTwoDecimalPlaces(double num){
        return (int) (num *100 ) /100.0;
    }

}
