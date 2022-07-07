package replit_practice;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.next();

        if (word.startsWith("x") || word.startsWith("X")) {
            if (word.endsWith("x") || word.endsWith("X")) {
                System.out.println(word.substring(1, word.length() - 1));

            } else if (!word.endsWith("x") || !word.endsWith("X")) {
                System.out.println(word.substring(1));
            }
        } else if (!word.startsWith("x") || !word.startsWith("X")) {
            if (word.endsWith("x") || word.endsWith("X")) {
                System.out.println(word.substring(0, word.length() - 1));

            } else if (!word.endsWith("x") || !word.endsWith("X")) {
                System.out.println(word);
            }

        }
    }
}


