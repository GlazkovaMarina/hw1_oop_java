package task1;

/**
 * Juice
 */

public class Juice extends Product{
    private int percentOfSugar;
    private String material;
    public Juice(int percentOfSugar, String material) {
        this.percentOfSugar = percentOfSugar;
        this.material = material;
    }
    public Juice(String name, Double price, int percentOfSugar, String material) {
        super(name, price);
        this.percentOfSugar = percentOfSugar;
        this.material = material;
    }
    public Juice(String name, int percentOfSugar, String material) {
        super(name);
        this.percentOfSugar = percentOfSugar;
        this.material = material;
    }
    
    @Override
    public String toString() {
        return String.format("%s; %s сок; Процент содержания сахара: %d%%", super.toString(), this.material, this.percentOfSugar);
    }
    public int getPercentOfSugar() {
        return percentOfSugar;
    }
    public String getMaterial() {
        return material;
    }
    public void setPercentOfSugar(int percentOfSugar) {
        this.percentOfSugar = percentOfSugar;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    
    
}