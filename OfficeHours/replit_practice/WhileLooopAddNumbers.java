package replit_practice;

import java.util.Scanner;

public class WhileLooopAddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int n = 1;
       int total = 0;

       while (n<=5){
           System.out.println("Enter number " +n);
           n++;
           total+=input.nextInt();
       }
        System.out.println(total);
    }
}
