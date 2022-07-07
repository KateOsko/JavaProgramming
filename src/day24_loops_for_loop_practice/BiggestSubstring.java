package day24_loops_for_loop_practice;

public class BiggestSubstring {
    /*
   Biggest substring of matching characters
       Given a String find the biggest substring of chars that match and print it.
       Ex: aaabbbcccccddddee Output: ccccc
    */
    public static void main(String[] args) {

        String s = "aaabbbcccccddddee";
        String sub = "";
        String longest = "";

        for (int i = 0; i < s.length()-1; i++) {
            sub += s.charAt(i); // adding same characters to the string
            if (s.charAt(i) != s.charAt(i + 1)) { // created a condition where variable transition to a different variable
                if (sub.length() > longest.length()) { // checking and assigning the longest substring to the longest
                    longest = sub; // if sub ("aaa") is longest that longest ("") --> then we longest = "aaa";
                }
                sub = ""; // empty the sub for the next character to be added and then compare
            }
        }
        System.out.println(longest);
    }
}
