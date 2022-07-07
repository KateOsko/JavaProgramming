package day11_if_statements;

import java.util.Scanner;

public class HoursOftheDay {
    public static void main(String[] args) {
        /*
        create an int value for the time of the day. Use a 24 hour format
use the given time of day to display a message
hint: use seperate if statements

	if the hours are from 6 - 11, print: Good morning
	if the hours are from 12 - 16, print: Good evening
	if the hours are from 17 - 23, print: Good night

         */
        Scanner input = new Scanner(System.in);
        System.out.println("What time is it right now");
        double time = input.nextDouble();

        if (time >= 6 && time <= 11) {
            System.out.println("Good morning");
            }
        if (time >=12 && time<=16) {
            System.out.println("Good evening");
        }
        if (time>=17 && time<=23) {
            System.out.println("Good night");
        }
        }
    }
