package day12_multi_branch;

import java.util.Scanner;

public class Biggest {
    /*
    declare and assign 3 int variables between the 3 numbers,
    find the print the biggest one
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 numbers. Use enter after each");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("This is the biggest number: " + num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("This is the biggest number: " + num2);
        } else {
            System.out.println("This is the biggest number: " + num3);
        }
    }
}
