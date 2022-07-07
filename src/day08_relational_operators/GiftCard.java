package day08_relational_operators;

public class GiftCard {
    public static void main(String[] args) {

        /*
        Task: declare and assign a gift card with 200
        buy two items, 1 item for x price, subtract from the gift card

        buy item 2 and subtract
        print the remaining balance
         */

        double giftCard = 200;
        double item1 = 50;
        double item2 = 10;

        double totalBalance = (giftCard - (item1+item2));
        System.out.println(totalBalance);


        //or use shorthand operators

        double giftCard1 = 200;
        giftCard1 -=50;
        giftCard1-=10;

        System.out.println("The remaining balance is now: $"+giftCard1);

    }
}
