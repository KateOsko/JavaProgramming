public class StringPalindrome {
   /* anna
      civic
      racecar
    */

    public static boolean isPalindrome (String str){
        String reverse= "";

        for (int i = str.length()-1; i >=0; i--) {
            reverse+=str.charAt(i);
        }
        return str.equalsIgnoreCase(reverse);
    }


    public static void main(String[] args) {
        String str = "hello";
        System.out.println(isPalindrome(str));
    }
}
