package day30_arrays;

public class ReverseMiddleWord {
    public static void main(String[] args) {
        /*

        have a sentence with 3 words
        reverse the middle word
        Ex:
        java always fun

        output:
        java syawly fun
         */

        String sentence = "java always fun";
        String [] words = sentence.split(" ");

        String reverse = "";
        char [] middleWord = words[1].toCharArray();
        for (int i= middleWord.length-1; i>=0; i--) {
            reverse += middleWord[i];
        }
        System.out.println(words[0] + " " + reverse + " " + words[2]);

    }
}
