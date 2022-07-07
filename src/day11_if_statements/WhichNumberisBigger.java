package day11_if_statements;
import java.util.Scanner;

public class WhichNumberisBigger {
    public static void main(String[] args) {
        /*
        Create two number variables
Find and print which number is bigger between the two

	ex:
		50
		45

		output:
		50 is bigger
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Insert a number");
        int num1 = input.nextInt();

        System.out.println("Insert a second number");
        int num2 = input.nextInt();

        if(num1>num2){
            System.out.println(num1+" is bigger than "+num2);} else{
            System.out.println(num2+ " is bigger than "+num1);
        }

    }
}
