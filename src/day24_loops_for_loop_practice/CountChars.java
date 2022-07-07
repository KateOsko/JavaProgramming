package day24_loops_for_loop_practice;

public class CountChars {
     /*
    Count upper, lower, and numbers
        Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
        Ex:
        Input: 2juMp41EEkd4s4

        Output:
        3 uppercase letters
        6 lowercase letters
        5 numbers
     */

    public static void main(String[] args) {

        String str = "2juMp41EEkd4s4";
        int upper = 0;
        int lower = 0;
        int number = 0;

        for (int i=0; i<str.length(); i++) {
            char letter = str.charAt(i);

            if(letter>='A' && letter<='Z'){
                upper++;
            } else if(letter>='a' && letter<='z'){
                lower++;
            } else if(letter>='0' & letter<='9'){
                number++;
            }
        }
        System.out.println(upper + " uppercase letters");
        System.out.println(lower + " lowercase letters");
        System.out.println(number + " numbers");


    }
}
