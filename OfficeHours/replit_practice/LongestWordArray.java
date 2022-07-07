package replit_practice;

import java.util.Scanner;

public class LongestWordArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];

        int largest = words[0].length();
        String word = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > largest) {
                largest = words[i].length();
                word = words[i];
            }
        }
            System.out.println(word);
        }
    }



