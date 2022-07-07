package day30_arrays;

public class LongestPolindrome {
    public static void main(String[] args) {
/*
    [IQ] Longest Palindrome
        Given a String array. Find the longest Palindrome String in your array.
        Ex:
        Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
        Ex:
        Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
        Output: No palindrome

     */

        String longestPalindrome;
        String[] words = {"java", " longer word", "civic", "apple", " racecar", "mom", "anna"};
                String longestP = "";

        //the first loop is iterating through the array
        for (String eachWord : words) { //eachWord = words[i]
            boolean isPalindrome = true;

            //inner loop is iterating through each String element
            for (int i = 0; i < eachWord.length(); i++) {
                if (eachWord.charAt(i) != eachWord.charAt(eachWord.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome && eachWord.length() > longestP.length()) {
                longestP = eachWord;
            }

        }
        System.out.println(longestP.isEmpty() ? "No Palindrome" : longestP);

    }
    }

