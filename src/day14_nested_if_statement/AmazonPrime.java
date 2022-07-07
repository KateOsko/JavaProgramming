package day14_nested_if_statement;

public class AmazonPrime {
    public static void main(String[] args) {
        /*
        Task: declare and assign a price variable
        declare and assign a boolean - hasPrime variable


            prime member: "Eligible for 2-day shipping"
            not prime: item price is more than 25: "Eligible for regular free shipping"
            not prime and item price is less than 25: "Not eligible for free shipping. Shipping fee: 3.99
         */


        double price = 35;
        boolean hasPrime = true;


        if (hasPrime) {
            System.out.println("Eligible for 2-day shipping");
        } else {
            if (price >= 25) {
                System.out.println("Eligible for regular free shipping");
            } else {
                System.out.println("Not eligible for free shipping");
                price += 3.99;

            }
        }
    }
}