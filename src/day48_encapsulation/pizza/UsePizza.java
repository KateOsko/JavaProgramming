package day48_encapsulation.pizza;

public class UsePizza {
    public static void main(String[] args) {
        Pizza first = new Pizza("large", 3);
        System.out.println(first);

        first.setNumberOfToppings(2);
        System.out.println(first);

        Pizza second = new Pizza("", -2);
        System.out.println(second);

        second.setSize("Small");
        second.setNumberOfToppings(-3);
        System.out.println(second);
    }
}
