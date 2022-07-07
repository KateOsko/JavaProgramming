import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWords {
    /*
    Write a method that will take a string as an argument.
    The method will reverse the position of words and return it.

    string into an ArrayList -> reverse ArrayList -> back to String
     */

    public static void main(String[] args) {
        String aa = "Hello My love";
        ArrayList<String> str = new ArrayList<>(Arrays.asList(aa.split(" "))); // turning a String into an ArrayList, separating by an empty space so that we get the words, not the characters.
        ArrayList<String> reverse = new ArrayList<>(); // creating an empty ArrayList called "reverse"

        for (int i = str.size() - 1; i >= 0; i--) {
            reverse.add(str.get(i)); // assigning each word to a new ArrayList reverse
        }
        System.out.println(Arrays.asList(reverse));
    }
}

