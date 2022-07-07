package day10_scanner_practice;

import java.util.Scanner;

public class Apartment {

    /*
        Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers, allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner, is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning, number of parking spaces, has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)

     */

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("What is the address");
        String address = input.nextLine();

        System.out.println("What is the owner name");
        String ownerName = input.nextLine();

        System.out.println("How many number of units");
        int numberOfUnits = input.nextInt();

        System.out.println("What is the average size for each unit");
        double averageSize = input.nextDouble();

        System.out.println("What the monthly rate amount");
        double monthlyRent = input.nextDouble();

        System.out.println("How many Washers and Dryers");
        int numberOfWashersDryers = input.nextInt();

        System.out.println("Are pets allowed?");
        boolean pets = input.nextBoolean();

        System.out.println("Does it have a pool");
        boolean pool = input.nextBoolean();

        System.out.println("What is the length of the lease");
        int lengthOfLease = input.nextInt();

        System.out.println("What is the total number of residents?");
        int numberOfResidents = input.nextInt();

        System.out.println("What is the phone number of the owner");
        String ownerPhone = input.nextLine();

        System.out.println("Is it near a gas station?");
        boolean gasStation = input.nextBoolean();

        System.out.println("What is the number of floors?");
        int numberOfFloors = input.nextInt();

        System.out.println("Does it have a basement");
        boolean basement = input.nextBoolean();

        System.out.println("Does it have available units for rent");
        boolean availableUnits = input.nextBoolean();

        System.out.println("Does it have air Conditioning");
        boolean ac = input.nextBoolean();

        System.out.println("How many parking spaces");
        int parkingSpaces = input.nextInt();

        System.out.println("Does it have a wheel chair access");
        boolean wheelChairAccess = input.nextBoolean();

        System.out.println("Please enter amount of stars-rating ");
        double numberOfStars = input.nextDouble();

        System.out.println("All info");
        String allInfo = input.nextLine();

        /////////////////

        System.out.println("Monthly rent after 3 years is equal to $" + (monthlyRent * 0.9));
        System.out.println("Monthly rate after 6 month is equal to $" + (monthlyRent * 0.8));
        System.out.println("Average number of residents per unit is " + (numberOfResidents/numberOfUnits));
        System.out.println("Average number of parking lots per unit is: " + (parkingSpaces/numberOfUnits));
        System.out.println( "Average number of units is " + (numberOfUnits/numberOfFloors));


    }
    }

