package day16_review;

import java.util.Scanner;

public class ComputerBuilder {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Select screen size:");
        String screenSize = input.next();

        System.out.println("Select CPU type: ");
        String cpu = input.next();

        System.out.println("Select RAM size: ");
        int ram = input.nextInt();

        System.out.println("Select storage type:");
        String storageType = input.next();

        System.out.println("Select storage size: ");
        int storageSize = input.nextInt();

        System.out.println("Select screen resolution: ");
        String screenResolution = input.next();

        double price = 0;

        switch (screenSize) {
            case "13.3":
                price += 200;
                break;
            case "15.0":
                price += 300;
                break;
            case "17.3":
                price += 400;
                break;
        }

        switch (cpu) {
            case "i3":
                price += 150;
                break;
            case "i5":
                price += 250;
                break;
            case "i7":
                price += 350;
                break;
        }

        price+=50*(ram/4);

        switch (storageType) {
            case "HDD":
                if(storageSize<500) {
                    price += 0;
                }else {price+=50*(storageSize / 500);
                }
                break;
            case "SSD":
                if(storageSize<500) {
                    price += 0;
                }else{
                    price += 100*(storageSize / 500);
                }
                break;
        }

        switch (screenResolution) {
            case "FULLHD":
                price += 100;
                break;
            case "4K":
                price += 200;
                break;
        }

        System.out.println("Final price is: $" + price);

    }

}
