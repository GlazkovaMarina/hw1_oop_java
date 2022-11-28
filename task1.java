package task1;

import java.util.ArrayList;
import java.util.List;

public class task1 {

    public static void main(String[] args) {
        List<Product> prods = new ArrayList<>();
        prods.add(new Product("Чипсы", 60.0));
        prods.add(new Product("Кофе", 120.0));
        prods.add(new Product("Шоколад", 80.0));
        prods.add(new Product("Сок", 70.0));
        prods.add(new Milk("Петмол", 60.0, 5.0f));
        prods.add(new Milk("Простоквашино", 65.0, 2.5f));
        prods.add(new Juice("Я", 180.0, 0, "яблочный"));
        prods.add(new Juice("Добрый", 150.0, 5, "апельсиновый"));

        VendingMachine v1 = new VendingMachine(prods);
        System.out.println(v1);
        System.out.println(v1.getProductBy("Шоколад"));
        System.out.println(v1.getProductBy(120.0));
    }
}

