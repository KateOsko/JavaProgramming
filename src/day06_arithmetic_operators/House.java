package day06_arithmetic_operators;

public class House {
    public static void main(String[] args) {

    String houseType = "Penthouse", address = "129322 Central Park";

    int numberOfBedrooms = 4, numberOfBathrooms = 3, numberOfKitchen = 2, zipcode=22234;

    boolean hasBasement = false, hasAttic = false, hasPool = true, isOnSale = false, hasPark = true;

    double costOfHouse = 1_000_000.99, schoolRating = 4.6; //4.5


        String houseInfo = "The " + houseType + " on " +address + ", " + zipcode + " costs $" + costOfHouse + "\nThe " + houseType + " has " + numberOfBedrooms + " bedrooms, " + numberOfBathrooms + " bathrooms, "+ numberOfKitchen + " kitchen\nIt also includes a basement: " +hasBasement+ " ,has an attic: " + hasAttic +", has a pool: " + hasPool + ", is on sale: " + isOnSale + ", and has a park: " + hasPark + ". The schools in the area have a rating of: " + schoolRating;

        System.out.println(houseInfo);

}
 }