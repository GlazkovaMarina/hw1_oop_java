package task1;

public class Product {
    private String name;
    private Double price;
    public Product(){
        this("", 0.0);
    }
    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }
    public Product(String name){
        this(name, 0.0);
    }
    public String getName() {
        return this.name;
    }
    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        if (price >= 0)
            this.price = price;
    }
    @Override
    public String toString() {
        return String.format("Наименование: %s; Стоимость: %,.2f", this.name, this.price);
    }
    
}
