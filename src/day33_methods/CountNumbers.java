package day33_methods;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class CountNumbers {
    /*
    count up to a certain number
     */
    public static void CountNumbers (int num){
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
    }


        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Enter your number");
            int num = input.nextInt();
            CountNumbers(num);




        }
    }

