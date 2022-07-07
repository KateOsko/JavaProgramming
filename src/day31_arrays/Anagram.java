package day31_arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
    /*
     given two Strings
     find if they are anagrams or not

     the characters are the same in both Strings but the order is different
     */
        String first = "listen";
        String second = "ilent";

        char[] f = first.toCharArray();
        char[] g = second.toCharArray();

        Arrays.sort(f);
        Arrays.sort(g);

        if (f.length == g.length) {
            if (Arrays.equals(f, g)) {
                System.out.println("Anagram");
            } else {
                System.out.println("NOT");
            }
        } else System.out.println("NOT");
    }

    /*    char[] f = first.toCharArray();
        char[] s = second.toCharArray();
        Arrays.sort(f);
        Arrays.sort(s);

        if (Arrays.equals(f, s)) {
            System.out.println("Anagram");
        } else {
            System.out.println("NOT");

    } */
}

