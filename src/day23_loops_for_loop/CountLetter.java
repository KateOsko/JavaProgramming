package day23_loops_for_loop;

import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {
        /*

        Given a String and we want to count how many characters we have

        Challenge: adjust so that we can check for not only 'a' but any character
        ex: aabbcaa
        4
         */

     /*   String word = "aabbcca";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') { //checks if every character is equal to a
                count++;
            }
        }
            System.out.println(count);
        } */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = input.nextLine();

        int count = 0;
        for(int i=0; i<=str.length()-1; i++){
            if(str.charAt(i) == 'h' && str.charAt(i+1)=='i')
                count++;
        }
        System.out.print(count);
    }
}





