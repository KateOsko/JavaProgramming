package day37_wrapper_arraylist;

public class Practice_UpIsEqualToLow {
    /*
    Wrapper Classes Practice
-----------------------------------------------------------------------------
Write program that returns true if the total number of uppercase
characters are equal to total number of lowercase characters of a
string

Ex:
	str = "JAVA java";

output:

	true
     */
    public static void main(String[] args) {
        String str = "HELLO hello";
        int upper = 0;
        int lower = 0;

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (Character.isUpperCase(letter)) {
                upper++;
            } else if (Character.isLowerCase(letter)) {
                lower++;
            }
        }
        if (upper == lower) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }


    }
}

