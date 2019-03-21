public class Store {

    private Product[] products;
    private int total;

    public Store(int numberItems){
        products = new Product[numberItems];
        total = 0;
    }

    private boolean isFull(){
        return (total == products.length);
    }

    private boolean isEmpty(){
        return (total == 0);
    }

    public boolean add(Product product){
        if (isFull()){
            return false;
        }
        else{
            products[total] = product;
            total++;
            return true;
        }
    }

    public String listProducts(){
        if (isEmpty()){
            return "No products";
        }
        else{
            String listOfProducts = "";
            for (int i = 0; i < total; i++){
                listOfProducts = listOfProducts + i + ": " + products[i] + "\n";
            }
            return listOfProducts;
        }
    }

    public String cheapestProduct()
    {
        if (!isEmpty()){
            Product cheapestProduct = products[0];
            for (int i = 0; i < total; i++){
                if (products[i].getUnitCost() < cheapestProduct.getUnitCost() )
                    cheapestProduct = products[i];
            }
            return cheapestProduct.getProductName();
        }
        else
            return "No Products are in the ArrayList";
    }

    public String listCurrentProducts()
    {
        if (isEmpty()){
            return "No Products are in our current product line";
        }
        else
        {
            String listOfProducts = "";
            for (int i = 0; i < total; i++){
                if (products[i].isInCurrentProductLine())
                    listOfProducts = listOfProducts + i + ": " + products[i] + "\n";
            }
            return listOfProducts;
        }
    }

    public double averageProductPrice()
    {
        if (!isEmpty()){
            double totalPrice = 0;
            for (int i = 0; i < total; i++){
                totalPrice = totalPrice + products[i].getUnitCost();
            }
            return totalPrice / products.length;
        }
        else
        {
            return 0.0;
        }

    }

    public String listProductsAboveAPrice(double price)
    {
        if (!isEmpty()){
            String str = "";
            for (int i = 0; i < total; i++){
                if (products[i].getUnitCost() > price)
                    str = str + i + ": " + products[i] + "\n";
            }
            return str;
        }
        else
        {
            return "No Products are more expensive than: " + price;
        }

    }


}
