package day18_string_methods;

import org.w3c.dom.ls.LSOutput;

public class Trim {
    public static void main(String[] args) {

    String s = "   Saturday   ";
        System.out.println(s);
        System.out.println(s.length());

        s=s.trim();
        System.out.println(s);
        System.out.println(s.length());


        String str = "   java is fun   ";
        System.out.println(str.startsWith("java"));
        System.out.println(str.trim());



}
}
