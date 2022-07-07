package day09_scanner;
import java.util.Scanner;
public class AddNumbers {

    /*create Scanner object
    ask the user to enter 3 numbers
    find and print the sum of the numbers

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter three numbers");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();


        System.out.println("The sum of the numbers is: " + (num1+num2+num3));


    }
}
