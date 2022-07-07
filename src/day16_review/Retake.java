package day16_review;

import java.util.Scanner;

public class Retake {
    public static void main(String[] args) {


     /*
declare and assign a grade variable
declare and assign an attempt number

Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:

	If its the first attempt -> subtract 10%
	If its the second attempt -> subtract 20%
	If its the third attempt -> subtract 35%

Based on the retake attempt number calculate the final grade
    */

        Scanner input = new Scanner(System.in);
        System.out.println("What was the grade");
        int grade = input.nextInt();
        System.out.println("Which attempt number is it?");
        int attempt = input.nextInt();
        boolean validAtt = true;
        if (attempt == 1) {
            grade = grade - (int) (grade * 0.1);
        } else if (attempt == 2) {
            grade = grade - (int) (grade * 0.2);
        } else if (attempt == 3) {
            grade = grade - (int) (grade * 0.35);
        } else {
            System.out.println("Not valid attempt number");
            validAtt=false;
        }

        if(validAtt) {
            System.out.println(grade);
        }
    }
}
