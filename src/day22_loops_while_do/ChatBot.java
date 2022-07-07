package day22_loops_while_do;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keepTalking = true;
        while(keepTalking){

            System.out.println("Enter a message");
            String msg = input.nextLine();

            switch (msg){
                case "hello":
                    System.out.println("Hi");
                    break;
                case "how are you?":
                    System.out.println("I'm good");
                    break;
                case "bye":
                    System.out.println("No, don't leave");
                    keepTalking = false;
                default:
                    System.out.println("I don't know what you said");


            }
        }
    }
}
