package replit_practice;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        int half = word.length()/2;


        if (word.length()%2==0) {
            System.out.println(word.substring(half-1, half+1));
        } else {
            System.out.println(word.substring(half, half+1));
        }
    }
}


