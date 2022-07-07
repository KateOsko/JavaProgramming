package day47_encapsulation;

public class Bank_UsingDebitCard {

    public static void main(String[] args) {
        System.out.println(DebitCard.accountType); // static block executed

        DebitCard obj1 = new DebitCard(1234567891112141L, "James", 10000000);
        System.out.println(obj1);

        System.out.println("----------------------------");

        DebitCard obj2 = new DebitCard(1235567891112141L, "Ben", 10000002);
        System.out.println(obj2);
        System.out.println(obj2.accountType);

        System.out.println("----------------------------");

        DebitCard obj3 = new DebitCard(1334957891112141L, "James", "Visa", 8824, 10004050);
        System.out.println(obj3);

        System.out.println("-------------the invalid---------------");

        DebitCard obj4 = new DebitCard(1334957891112141L, "James", "Money", 84, 1000650);
        System.out.println(obj3);
    }
}
