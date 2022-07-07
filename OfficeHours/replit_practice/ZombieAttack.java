package replit_practice;

import java.util.Scanner;

public class ZombieAttack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        int day = 0;

        while (n>0){
            System.out.println("Day" + day++  + "[" + n + "]");
            n/=2;}

        System.out.println("------EXTINCT-----");

        }
    }

