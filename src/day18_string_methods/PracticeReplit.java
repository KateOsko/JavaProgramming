package day18_string_methods;

import java.util.Scanner;

public class PracticeReplit {
    public static void main(String[] args) {


        //WRITE YOUR CODE BELOW
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = "apple";

        //WRITE YOUR CODE BELOW

        String last = "";
        if (word.length() == 5) {
            System.out.print(word.charAt(0) + " " + word.charAt(1) + " " + word.charAt(2) + " " + word.charAt(3) + " " + word.charAt(4));
        } else if (word.length() > 5) {
            System.out.println("Too long!");
        } else if (word.length() < 5) {
            System.out.println("Too short!");
        }
    }
}


