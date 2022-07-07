package day19_string;

import org.w3c.dom.ls.LSOutput;


public class CharMethod {
    public static void main(String[] args) {

        String s = "javar";
        //          0123

        System.out.println(s.length());

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
       // System.out.println(s.charAt(4)); not valid

        int lastIndex = s.length() - 1;
        System.out.println("last char:" + s.charAt(lastIndex)); // this is the same as line 17, but line 17 is hardcoded
}
}