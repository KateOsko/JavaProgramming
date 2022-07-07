package day15_switch_statements;

import java.util.Scanner;

public class Browsers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter browser");
        String browser=input.nextLine();
        System.out.println("Enter your url");
        String url=input.nextLine();


        switch (browser) {
            case "chrome":
            case "Chrome":
                System.out.println("Opening " + url + " in the chrome browser");
                System.out.println("Loading...");
                break;

            case "Safari":
                System.out.println("Opening " + url + " in safari");
                break;

            case "Firefox":
                System.out.println("Opening " + url + " in firefox");
                break;
            default:
                    System.out.println(browser + " is not valid browser");

        }

    }
}
