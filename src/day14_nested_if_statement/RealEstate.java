package day14_nested_if_statement;

import java.util.Scanner;

public class RealEstate {
    /*  We are buying a house
        ask the user for their budget (single number, max)

        Find the area that the user's budget fits into and provide all the information of the neighborhood

        extra condition: if the user gives a budget value below 0, it is invalid, so print: "That is not a valid budget". If the budget is more than 300,000 print "Too much money for this agency"

        Data based on neighborhood name:
            name - Hills
            average price - 80,000 - 100,000
            rating - 4.0
            gated - no
            allow pets - yes

            name - Oaks
            average price - 55,000 - 90,000
            rating - 3.5
            gated - no
            allow pets - yes
            name - Highland

            average price - 120,000 - 150,000
            rating - 4.5
            gated - yes
            allow pets - no

            name - Canyon
            average price - 160,000 - 201,000
            rating - 4.8
            gated - yes
            allow pets - yes

            If the budget is not in any range print: "No available houses" */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your max budget");

        double budget = input.nextDouble();
        String communityName = "", range="";
        double rating = 0;
        boolean gated=false, pets=false;

            if (budget > 0 && budget < 300_000) {
            System.out.println("Looking for houses...");

            if (budget >= 55000 && budget <= 75000) {
                communityName = "Oaks";
                range = "55000-75000";
                rating = 3.5;
                gated = false;
                pets = true;

            } else if (budget >= 80000 && budget <= 100000) {
                communityName = "Hills";
                range = "80000-100000";
                rating = 4.0;
                gated = false;
                pets = true;

            } else if (budget >= 120000 && budget <= 150000) {
                communityName = "Highland";
                range = "120000-150000";
                rating = 4.5;
                gated = true;
                pets = false;

            } else if (budget >= 160000 && budget <= 201000) {
                communityName = "Canyon";
                range = "160000-201000";
                rating = 4.8;
                gated = true;
                pets = true;

            } else {
                System.out.println("No available houses");
            }

            String ad = "Name of the neighborhood: " + communityName + "\nPrice range: " + range + "\nRating: " + rating;
            ad +=  "\nGated: " + (gated ? "Yes" : "No"); /* this means if the gated boolean is true, it will concatenate "yes" into the ad, but if the gated boolean is false it will concatenate "no" into the ad */
            ad += (pets ? "\nThey allow pets" : "\nThey don't allow pets");

            System.out.println(ad);

            } else {
            if (budget <= 0) {
                System.out.println("Your budget can not be less than 0");
            } else if (budget >= 300_000) {
                System.out.println("Too much money");
            }
        }
    }


}
