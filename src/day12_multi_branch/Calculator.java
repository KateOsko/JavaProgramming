package day12_multi_branch;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number one: ");
        double a = input.nextDouble();

        System.out.println("Pick the operator: + _ * ? / % ");
        String operator = input.next();

        System.out.println("Enter number two");
        double b = input.nextDouble();

        double result = 0;
        boolean validCal = true;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                System.out.println("The subtraction is equal to: " + (a - b));
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Can not divide by 0");
                    validCal = false;
                }
                break;
            case "%":
                if (b != 0) {
                    result = a % b;

                } else {
                    System.out.println("Can not do the remainder");
                    validCal = false;
                }
                break;

            default:
                System.out.println(operator = " is not a valid operator");
                validCal = false;
        }
        if(validCal){
            System.out.println(a+ " " + operator + " " + b + " = " + result);

        }





}
}
