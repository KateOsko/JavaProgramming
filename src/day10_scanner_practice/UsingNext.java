package day10_scanner_practice;

import java.util.Scanner;

public class UsingNext {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is today?");
        String day = input.nextLine();

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next(); //to send this data, you need to hit enter

        input.nextLine(); /*to enter input from the line above is absorbed here

        as long as nextLines are following each other, we won't have any problems. But if we have input.next or any other methods before input.nextLine, the code won't run. We will need to insert input.nextLine(); in between. It's a part of the scanner code

        If we use nextLine after other methods, we will need to insert
        input.nextLine(); */


        System.out.println("What is your address");
        String address = input.nextLine(); //

        System.out.println("Today " + day);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Your address is: " + address);
    }
}
