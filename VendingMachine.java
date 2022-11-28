package task1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products; 
    private final static List<Product> initProduct = new ArrayList<>();
    static{
        initProduct.add(new Product("apple", 25.0));
    }

    public VendingMachine(){
        this(initProduct);
    }
    public VendingMachine(List<Product> products){
        this.products = products;
    }
    public Product getProductBy(String name){
        for (Product product : products) {
            if (product.getName().contains(name)){
                return product;
            }
        }
        return null;
    }
    public Product getProductBy(Double price){
        for (Product product : products) {
            if (product.getPrice().equals(price)){
                return product;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        String result = "";
        for (Product product : products) {
            result = result.concat(product.toString() + "\n");
        }
        return result;
    }
}
