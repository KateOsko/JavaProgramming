package day55_polymorphism.clothes;

public class Store {

    public static void main(String[] args) {

        //All possible objects of TShirts


        Tshirt tshirt1 = new Tshirt(); // reference of itself
        tshirt1.wear();

        Clothes tshirt2 = new Tshirt(); // reference of parent
        tshirt2.wear();

        Object tshirt3 = new Tshirt();
      //  tshirt3.wear(); Object class does not have this wear method


        Jacket jacket1 = new Jacket(); // reference of itself
        jacket1.wear();
        jacket1.putOnHood();

        Clothes jacket2 = new Jacket(); // reference of the super class
        jacket2.wear();

    }
}