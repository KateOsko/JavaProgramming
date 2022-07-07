package day06_arithmetic_operators;

public class CastingExample {

    public static void main(String[] args) {
        short numOne = 40;
        float numTwo = numOne; //short is smaller han float, so no casting is needed from us

        System.out.println(numOne);
        System.out.println(numTwo);


        float num3 = 100.5F;
        short num4 = (short)num3; // float is bigger, so we cast down to short

        System.out.println(num3);
        System.out.println(num4);

        float num5 = 300;
        byte num6 = (byte)num5;

        System.out.println(num5);
        System.out.println(num6);

        char letter = 'A';
        int letter2 = letter;

        System.out.println(letter);
        System.out.println(letter2);
        System.out.println((int)letter);
        System.out.println((int)'R');
        System.out.println((int)letter);
        System.out.println((char)65);
        System.out.println((int)'P');
        System.out.println((char)80);
    }
}
