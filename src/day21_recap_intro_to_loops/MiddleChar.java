package day21_recap_intro_to_loops;

public class MiddleChar {
    public static void main(String[] args) {
        /* Middle char
    Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters. b) If the length of the string is odd there will be one middle character.
    Ex:
    Input: elephant
    Output: The middle characters: ph
         */

        String s = "abcdef";
        int len = s.length()/2;

        if (s.length() % 2 == 0) {
            //our word is even length
        } else {
            //our word is odd length


            //length/2 5/2==2

            char firstMiddle = s.charAt(len -1);
            char secondMiddle = s.charAt(len);

            System.out.println("With charAt: " + firstMiddle + secondMiddle);
            System.out.println("With substring: " + s.substring(len-1, len+1));

            char middle = s.charAt(len );
            System.out.println("With charAt: " + middle);
            System.out.println("With substring: " + s.substring(len , len  + 1));
            System.out.println(firstMiddle);


        }
    }
}
