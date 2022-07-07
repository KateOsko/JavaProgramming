package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Store {

    public static void main(String[] args) {

        String[] items = {"Shoes", "Jackets", "Gloves", "Airpods", "IPad"};

        // Do we have jackets in stock?

        boolean hasJacket = false;

        for (int i = 0; i < items.length; i++) {

            if (items[i].equalsIgnoreCase("jackets")) {
                hasJacket = true;
                break;
            }

        }

        System.out.println(hasJacket ? "Jackets in stock" : "Jackets out of stock");

        System.out.println(Arrays.toString(items).toLowerCase().contains("jackets"));


Scanner input = new Scanner(System.in);
        System.out.println("Which item are you looking for?");
        String item = input.nextLine();
        boolean inStock = false;

        for (int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase(item)){
                inStock = true;
                break;
            }
        }
        System.out.println(inStock ? "in stock" : "out of stock");

    }

}