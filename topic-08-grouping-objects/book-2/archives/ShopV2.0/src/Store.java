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

}
