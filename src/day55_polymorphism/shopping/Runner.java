package day55_polymorphism.shopping;

public class Runner {
    public static void main(String[] args) {
        /*

         */

        Target target = new Target();
        target.price = 10;
        System.out.println(target.price);
        target.buyItem();
        target.returnItem();
        // target.payForShipping(true); Target class does not implement the SHipping interface

        System.out.println();

        Amazon amazon = new Amazon();
        amazon.price = 1000;
        amazon.buyItem();
        amazon.returnItem();
        amazon.payForShipping(true);
        amazon.viewCart();
        System.out.println(amazon.country);

        System.out.println(Shipping.country); // proper way to do it
    }
}
