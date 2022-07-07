package day58_exceptions;

import day58_exceptions.bank.InvalidCredentialsException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticingExceptions {
    public static void main(String[] args) throws InterruptedException {
    // throws keyword is used with checked exceptions


        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("World");
        Thread.sleep(4000);
        System.out.println("how are you?");
        Thread.sleep(4000);
        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if(age<0 || age>130){
            throw new InputMismatchException("Invalid Age: "+ age);
        }

        System.out.println("age = " + age);
    }
}