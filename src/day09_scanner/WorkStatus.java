package day09_scanner;
import java.util.Scanner;
public class WorkStatus {

    /*
    Create scanner object
    ask the user to enter their first name - next
    ask the user to enter their last name  - next
    ask the user if they are employed - boolean
    ask the user if they are a student - boolean
     */

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter First Name");
        String firstName = input.next();

        System.out.println("Please enter Last Name");
        String lastName = input.next();

        System.out.println("Please enter employment");
        boolean employed = input.nextBoolean();

        System.out.println("Please enter if you are a student");
        boolean student = input.nextBoolean();

        String details = firstName + " " + lastName + " " + employed + " is employed " + student + " and they are student " + student;

    }
}

