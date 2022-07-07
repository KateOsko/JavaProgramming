package day47_encapsulation;

public class Computer {
    /*

     */

    String brand;
    double price;
    String color;

    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    static {
        System.out.println("Static block run");
        hasScreen = false;
        hasBattery = true;
        hasMemory = true;
    } // executed when the class is being used

    public Computer(String brand, double price, String color) {
        System.out.println("Constructor run");
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
