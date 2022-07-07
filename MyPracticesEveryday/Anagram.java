import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    /*
    given two Strings
    find out if they are Anagrams of not

    the characters are the same in both Strings but the characters are different

     */

    public static void main(String[] args) {
        String str = "listen";
        String str2 = "sile5nt";

        char[] first = str.toCharArray();
        char[] second = str2.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        if (Arrays.equals(first,second)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }


    }
}
//    public static void main(String[] args) {
//        String one = "Triangle".toLowerCase();
//        String two = "Integral".toLowerCase();
//
//        char[] a = one.toCharArray();
//        char[] b = two.toCharArray();
//        Arrays.sort(a);
//        Arrays.sort(b);
//
//
//        if (Arrays.equals(a, b)) {
//            System.out.println("Anagram");
//        } else {
//            System.out.println("Not Anagram");
//        }
//
//
//    }
//}
