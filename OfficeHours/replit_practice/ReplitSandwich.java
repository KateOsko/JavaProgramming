package replit_practice;

import java.util.Scanner;

public class ReplitSandwich {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //System.out.println("Enter a sentence");
        //String str = scan.next();
        String str = "euergsvffbreejdfvfgxhbdve";

        String one = str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
        String two = str.substring(str.lastIndexOf("bread") + 5);


        if (str.contains("bread")) {
            System.out.println(one);
        } else {
            System.out.println("nothing");
        }


        /* int two = str.lastIndexOf("bread");

        if (str.contains("bread")) {
            System.out.println(str.substring(one + 5, two));
        } else {
            System.out.println("nothing");
        } */
    }
}

