package replit_practice;

import java.util.Scanner;

public class Alejandro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter email");
        String email = s.nextLine().toLowerCase();

        //String email = "subject : important project, alejandro we need you for this..";
        //WRITE YOUR CODE BELOW

        if (email.contains("alejandro")) {
            if (email.contains("project")) {
                System.out.println("priority");
            } else {
                System.out.println("read");
            }
        } else {
            System.out.println("don't read");

        }
    }
}
