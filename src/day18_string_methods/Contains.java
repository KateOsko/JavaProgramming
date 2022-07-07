package day18_string_methods;

public class Contains {
    public static void main(String[] args) {
        String day = " Today it is above 70";
        System.out.println(day.contains("it is")); //true//true
        System.out.println(day.contains("itis"));//false
        System.out.println(day.contains("ay it")); //true you gotta look for sequence of characters
        System.out.println(day.contains("7"));
        System.out.println(day.contains("today"));//false because we had Today with uppercase
        System.out.println(day.contains("Ti7"));//false

        System.out.println(((day.contains("T") && day.contains("i") && day.contains ("7"))));
        /*
    if you want to check for specific characters
    day.contains("T") && day.contains("i) && day.contains ("7")
     */

    }
}
