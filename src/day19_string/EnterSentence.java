package day19_string;

import java.util.Scanner;

public class EnterSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = input.nextLine();

        int lastIndex = s.length() - 1;
        System.out.println(lastIndex);

        System.out.println("first char:" + s.charAt(0));
        System.out.println("last char: "+ s.charAt(s.length()-1));
    }
}
/*
Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine();

        System.out.println("First char: " + str.charAt(0));
        System.out.println("Last char: " + str.charAt(str.length() - 1));
 */