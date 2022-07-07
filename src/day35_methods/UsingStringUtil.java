package day35_methods;

import my_utilities.StringUtil;

public class UsingStringUtil {
    public static void main(String[] args) {
        System.out.println(StringUtil.reverse("apple"));

        System.out.println(StringUtil.fixFormat("jaMeS"));

        System.out.println(StringUtil.frequencyOfCharacter("apple", 'p'));
        System.out.println(StringUtil.frequencyOfCharacter("apple", 'z'));

        System.out.println(StringUtil.uniqueCharacters("eeiiooy"));
    }

}
