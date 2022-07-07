public class SumOfDigitsString {
    /*
            2)String - sum of digits in a string
        Write a method that can return the sum of the digits in a string

     */

    public static int sumOfDigits (String str){
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum+=str.charAt(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits("Hello"));
    }
}
