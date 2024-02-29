package products;

import products.Product;

public class Drink extends Product {

    public static String type = "drink";
    public Drink(String name, Integer cost){
        super(name, cost);
    }
}
