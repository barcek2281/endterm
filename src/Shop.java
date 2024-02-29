import products.*;

import java.util.ArrayList;
import java.util.Locale;

public class Shop {

    private String name;
    ArrayList<Product> products = new ArrayList<Product>();


    public Shop(String name){

        this.name = name;


        products.add(new Bread("Батон ХМК", 150));
        products.add(new Milk("Моя семья", 350));
        products.add(new Drink("Maxi tea", 450));
    }

    public void addNewProduct(String typeOfProduct, String nameOfProduct, Integer costOfProduct){

        if (typeOfProduct.equalsIgnoreCase("bread")) {
            products.add(new Bread(nameOfProduct, costOfProduct));
        }
        else if(typeOfProduct.equalsIgnoreCase("milk")){
            products.add(new Milk(nameOfProduct, costOfProduct));
        }
        else if (typeOfProduct.equalsIgnoreCase("drink")) {
            products.add(new Drink(nameOfProduct, costOfProduct));
        }
        else {
            System.out.println("Error not valuable type of product");
            return;
        }
        System.out.println("new product added");
    }

    public ArrayList<Product> getProducts(){
        return this.products;
    }

    public String getName() {
        return name;
    }

}
