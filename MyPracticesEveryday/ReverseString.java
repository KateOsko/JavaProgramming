public class ReverseString {
    /*
    Write a method that will take one string as an argument and will return the reverse version of this string.
     */

    public static String reversestr (String str){
        String reverse = "";
        for (int i = str.length()-1; i>=0; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reversestr(str));
    }
}
