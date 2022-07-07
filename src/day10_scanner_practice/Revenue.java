package day10_scanner_practice;

import java.util.Scanner;

public class Revenue {

    /*
    Write a program that asks the user to enter a price and quantity and then calculate the revenue. revenue = price × quantity.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //make scanner object

        //popular names for Scanner: scan, input, scanner, keyboard

        System.out.println("Enter the price of the item");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = scan.nextInt();

        double revenue = price * quantity;
        System.out.println("The revenue is $"+ revenue);


    }
}
