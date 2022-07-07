package my_utilities;

import javax.imageio.stream.ImageInputStream;
import java.util.Currency;

public class StringUtil {
    /*
    reverse
    create a method that will acccept a String and return the reversed version
     */
    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }


        public static String fixFormat(String str) {
            return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();

        }

    public static int frequencyOfCharacter (String str, char letter){
        int count = 0;
        for (int i=0; i<str.length(); i++ ){
            if(str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }


    public static String uniqueCharacters(String str){

        String unique = "";

        for(int i = 0; i < str.length(); i++){

            int count = StringUtil.frequencyOfCharacter(str, str.charAt(i));

            if(count == 1){
                unique += str.charAt(i);
            }
        }

        return unique;
    }
}






