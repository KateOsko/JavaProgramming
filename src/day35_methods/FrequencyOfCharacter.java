package day35_methods;
import my_utilities.StringUtil;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        System.out.println(StringUtil.frequencyOfCharacter("apple", 'p'));}

        public static int frequencyOfCharacter(String str,char letter){
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == letter) {
                    count++;
                }
            }
            return count;


    }
    }


