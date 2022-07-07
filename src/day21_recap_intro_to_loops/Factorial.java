package day21_recap_intro_to_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int n = input.nextInt();
        int total = 1;

        // 5*4*3*2*1
        // repeated action is to multiply numbers by one less than it
        // stopping point: get to 1

        while (n > 0) {
            total *= n;
            n--;
        }

        System.out.println(total);
    }
    }
