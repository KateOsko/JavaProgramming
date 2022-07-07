package day17_string_method;

import java.util.Scanner;

public class PracticeSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter numbers");
        byte b1 = scan.nextByte();
        byte b2 = scan.nextByte();
        int max = (b1>b2) ? b1+2 : b2-4;
        System.out.println(max);
    }
}