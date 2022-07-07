package day22_loops_while_do;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        /*
        enter number 1
            -> type number

        enter number 2
            -> type number

        enter number 3
            -> type number

        enter number 4
            -> type number

        enter number 5
            -> type number

         */

        int number = 1;
        int total = 0;

        while(number<=5){
            System.out.println("Enter number "+number);
            number++;
            total += input.nextInt();
        }

        System.out.println(total);

    }
}
