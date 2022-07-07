import java.util.Scanner;

public class FizzBuzz {

    /*
    Print numbers from 1 to 100
- if a number is divisible by 3 print Fizz
- if a number is divisible by 5 print Buzz
- if a number is divisible by both 3 and 5 print FizzBuzz
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();

        if (num >= 1 && num <= 100) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
        } else {
            System.out.println("wrong number");
        }


    }
}
