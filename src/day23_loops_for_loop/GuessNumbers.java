package day23_loops_for_loop;

import java.util.Scanner;

public class GuessNumbers {
    /*
    create a program to guess the secret number.
flow will be as follows:
define the secret number, hard coded
ask the user to guess a number
based on the guess tell them a message:

  if they guess higher than the number:
      too high

  if they guess lower than the number:
      too low

  if they guess the number:
      you guessed correctly

      -> this will stop the guessing flow

Challenge: keep track of the number of attempts taken to guess right
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secretNumber = 80; // in the future we will learn how to make a random number
        int guess;

        do {
            System.out.println("Enter a number");
            guess = input.nextInt();
             if(guess > secretNumber) {
                 System.out.println(guess + " is too high");
             } else if (guess < secretNumber) {
                 System.out.println(guess + " is too low");
             }

        } while
        (guess !=secretNumber);

        System.out.println("You guessed correct");
    }
}
