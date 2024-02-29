import products.Bread;
import products.IproductDate;
import products.Milk;
import products.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class userInterface {

    private static Scanner scn = new Scanner(System.in);
    public static void tableOfProducts(Shop shop){
        if (shop == null) {
            System.out.println("Error shop is null");
            return;
        }

        ArrayList<Product> products = shop.getProducts();

        // Print section
        System.out.println("Shop: " + shop.getName());
        for (int i = 1; i <= products.size(); i++) {
            System.out.print(i + ": " + products.get(i - 1).getName() + " - " + products.get(i - 1).getCost() + " tenge");
            if (products.get(i - 1) instanceof Bread || products.get(i - 1) instanceof Milk) {
                System.out.print(((IproductDate) products.get(i - 1)).printBeforeDate());
            }
            System.out.println();
        }
    }

    public static void addNewProduct(Shop shop){
        if (shop == null){
            System.out.println("Error shop is null");
            return;
        }
        try {
            System.out.println("Insert type of product" + "\n"
                    + "1) Bread" + '\n'
                    + "2) Milk" + '\n'
                    + "3) Drink");

            String typeOfProduct = scn.nextLine();

            System.out.print("Insert name of product: ");

            String nameOfProduct = scn.nextLine();

            System.out.print("Insert cost of product: ");

            Integer costOfProduct = scn.nextInt();

            shop.addNewProduct(typeOfProduct, nameOfProduct, costOfProduct);

        }catch (Exception e){
            System.out.println("ERROR");
        }




    }
}
