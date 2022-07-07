package day24_loops_for_loop_practice;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        /*
    Count Words
    Given a sentence determine how many words are in the String.
    Ex:
    Input:
    This has multiple words Output:
    4
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine().trim();
        int spaces = 0;

        for(int i= 0; i<str.length(); i++){
            if(str.charAt(i)== ' '){
                spaces++;
            }
        }

        System.out.println("Number of words: " + (spaces +1));
        //spaces+1 is because two words have one space. Since we are looking for a numbe of words. the number of spaces + 1 will show the number of words.
    }
}
