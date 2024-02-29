import products.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop magnumDaily = new Shop("Magnum daily");

        boolean running = true;
        Scanner scn = new Scanner(System.in);

        while(running){

            System.out.println("Shop - " + magnumDaily.getName() + "\n"+
                    "1) show all products" + "\n" +
                    "2) insert new product" + "\n" +
                    "0) exit from program");

            String action = scn.nextLine();

            switch (action){
                case "1" : {
                    userInterface.tableOfProducts(magnumDaily);
                    break;
                }
                case "2" : {
                    userInterface.addNewProduct(magnumDaily);
                    break;
                }

                case "0":{
                    running = false;
                }
                default: break;
            }

            System.out.println("\n\n");

        }

        System.out.println("Завершение программы.");

    }
}
