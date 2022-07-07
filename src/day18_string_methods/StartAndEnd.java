package day18_string_methods;

import java.util.Scanner;

public class StartAndEnd {
    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        String str= "Apples";
        System.out.println(str.startsWith("App"));
        System.out.println(str.startsWith("app"));

        System.out.println(str.startsWith("Apples"));

        String s="A";
        System.out.println(str.startsWith(s));


        System.out.println(str.startsWith(" App"));


        String sentence = "today was a good day";
        System.out.println(sentence.startsWith( "today was a")); //true
        System.out.println(sentence.startsWith(" today was a"));//false

        String sentence2 = "today was a good day";
        System.out.println(sentence.startsWith(sentence2)); //compares if both strings starts with the same characters

        System.out.println("\n");
        String word = sr.next();

        //WRITE YOUR CODE BELOW
        System.out.println(word.startsWith("a"));
        System.out.println(word.endsWith("e"));
    }
}
