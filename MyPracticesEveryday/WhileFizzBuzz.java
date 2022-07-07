public class WhileFizzBuzz {
    public static void main(String[] args) {

        /*Print numbers from 1 to 100
                - if a number is divisible by 3 print Fizz
        - if a number is divisible by 5 print Buzz
        - if a number is divisible by both 3 and 5 print FizzBuzz
        */
        int num = 5;

        while (num <= 5) {

            if (num % 5 == 0 && num % 3 == 0) {
                System.out.println("FizzBuzz ");
                break;
            } else if (num % 5 == 0) {
                System.out.println("Buzz ");
                break;
            } else if (num % 3 == 0) {
                System.out.println("Fizz ");
                break;
            } else {
                System.out.println("Invalid ");
                break;
            }
        }
    }
}
