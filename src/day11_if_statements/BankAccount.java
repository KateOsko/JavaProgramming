package day11_if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {


    /*
    Task: Hard code -> Dynamic

    Create a double value for the account balance.
    Create a double value for how much you want to withdraw

    Check the balance after the withdrawal
        if you tried to withdraw more money that you had in the account add a negative overdraft fee to the balance

    In both cases print the remaining balance after withdrawing, with overdraft free applied if you went over
     */
        Scanner input = new Scanner(System.in);

        System.out.println("What is your balance?");
        double balance = input.nextDouble();

        System.out.println("How much are you withdrawing");
        double withdrawal = input.nextDouble();

        //hard coded version
        //double balance = 400;
        //double withdrawal = 500;

        //withdraw some amount of money from my balance
        balance -= withdrawal;//balance = balance-withdrawal

        if (balance < 0) {
            System.out.println("Took out too much money, $100 overdraft applied");
            System.out.println("Balance before free: " + balance);}

        balance -= 100;//balance = balance-100;
        System.out.println("Balance $" + balance);

    }
}