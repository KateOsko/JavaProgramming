package day16_review;

import java.util.Scanner;

public class ColorPicker {

    public static void main(String[] args) {
        /*
        you are working on the art piece
        this program will help you to pick some colors

        flow: ask for color
            get 3 unique colors by the end
         */

        Scanner input = new Scanner(System.in);
        int colorsPicked = 0;
        String uniqueColors = "";

        while (colorsPicked<3){
            System.out.println("Pick a color");
            String color = input.nextLine();

           // System.out.println(color);


            if(uniqueColors.contains(color)){
                System.out.println("You already have that color");
            } else{
                // if we are here it means the color is unique
                uniqueColors +=color+ " ";
                colorsPicked++;
            }

           // uniqueColors+=color + " ";
        }
        System.out.println(uniqueColors);
    }
}
