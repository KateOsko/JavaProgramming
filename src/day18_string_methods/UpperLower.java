package day18_string_methods;
import java.util.Locale;
public class UpperLower {
    public static void main(String[] args) {

        String str = "sNOw";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str);

        String word = "HELLO";
        word = word.toLowerCase();
        System.out.println(word);

        String word2 = word +"World";
        System.out.println(word2);
        System.out.println(word);
        word+="new text"; // word = word + "next text
        System.out.println(word);
        System.out.println("\n");

        /*String old = "mark";
        String newValue = old.toUpperCase();
        System.out.println(old);
        System.out.println(newValue);
        System.out.println(newValue);
*/

    }
}

