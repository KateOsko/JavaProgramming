package day25_recap;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        /* Prime number [Loops]

Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.
Ex:
	Input:
		11
	Output:
		prime

Ex:
	Input:
		10
	Output:
		not prime
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();

        boolean isPrime = number>=2; // positive number

        for (int i = 2; i < number ; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

            if(isPrime) {
                System.out.println(number + " is Prime ");
            } else {
                System.out.println(number + " is NOT Prime");
            }

        }

        }



 /*
            n%2
            n%3
            n%4
            ...
            n%less than number
         */
//this loop is trying to check if any number is evenly divisible from 2 to the number