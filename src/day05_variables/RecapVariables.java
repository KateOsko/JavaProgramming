package day05_variables;

public class RecapVariables {
    public static void main(String[] args) {
//        Declare variables

        byte numberOfCoffeeCups;
        double totalPriceofCoffee;
        int totalStudentsInClass;

//        We can not print the Variables because they don't have a value
        // System.out.println("numberOfCoffeeCups");
        // System.out.println("totalPriceofCoffee");
        //System.out.println("totalStudentsInClass");

        //Assigning to variables

        numberOfCoffeeCups = 2;
        totalPriceofCoffee = 10.25;
        totalStudentsInClass = 432;


        System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceofCoffee);
        System.out.println(totalStudentsInClass);

       System.out.println(numberOfCoffeeCups + " # " + totalStudentsInClass); // we use concatunation to print the values of two variables

//        Declare and assign
        double temperature = 20.6;
        int javaDays = 5;

        System.out.println("This is my temperature: " + temperature);
        System.out.println("It is day " + javaDays + " in Java class");
    }
}
