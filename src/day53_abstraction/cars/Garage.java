package day53_abstraction.cars;

public class Garage {
    public static void main(String[] args) {


        Toyota obj2 = new Toyota();
        obj2.start();

        System.out.println();

        Honda obj3 = new Honda();
        obj3.start();

        // Both Toyota and Honda are concrete so we had to implement the start method

        // ElectricCar obj4 = new ElectricCar();

       // ElectricCar is abstract so we can not create an object
        System.out.println();
                Tesla obj5 = new Tesla();
                obj5.start(); // defined in the Car class
                obj5.charge(); // defined in the Electric class

        /*

    the Tesla class is a sub classes of the ElectricCar class

    the ElectricCar class is abstract and the Tesla is not abstract (non-abstract)

    normal class(non-abstract) cannot have abstract methods

    so, we have to override any/all abstract method that were inherited


 */
    }
}