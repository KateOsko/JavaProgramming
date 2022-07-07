package replit_practice;

import java.util.Scanner;

public class HashtagLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();

        for(int i=0; i<n; n--)
            System.out.println("#");

         /*while loop is like an IF statement
        when the boolean expression is true -> the cycle continues

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();

            while (n >= 0) {
            System.out.print("#");
            n--;
*/
        }
    }

