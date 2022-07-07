package day19_string;

import java.util.Scanner;

public class Initials {
    /*
            Ask the user to enter their first name
            Ask the user to enter their last name
            Print the initials as uppercase letters

            james
            bond
            JB
         */

    public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name");
        String Fname = input.next().toUpperCase();

        System.out.println("Enter your last name");
        String Lname = input.next().toUpperCase();

        System.out.println(Fname.charAt(0)+Lname.charAt(0)+"");

}
}