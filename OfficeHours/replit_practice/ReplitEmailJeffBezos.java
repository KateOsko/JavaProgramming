package replit_practice;

import java.util.Scanner;

public class ReplitEmailJeffBezos {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       System.out.println("Please enter your email");
       String email = input.nextLine();


        String ffirstletter = email.substring(0,1).toUpperCase();
        String name2 = email.substring(1,email.indexOf("_"));
        String name3 = (ffirstletter+name2);
        System.out.println("First name: " + name3);


        String lfirstletter = email.substring(email.indexOf("_")+1,email.indexOf("_")+2).toUpperCase();
        String lName2 = email.substring(email.indexOf("_")+2, email.indexOf("@"));
        String lName3 = lfirstletter+lName2;
        System.out.println("Last name: " + lName3);

        String efirstLetter = email.substring(email.indexOf("@")+1, email.indexOf("@")+2).toUpperCase();
        String emaiL2 = efirstLetter + email.substring(email.indexOf("@")+2, email.indexOf("."));
        System.out.println("Domain: " + emaiL2);

    }
}
