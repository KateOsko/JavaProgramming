package day08_relational_operators;

public class PositiveNegativeNumber {

    public static void main(String[] args) {

        int number=20;

        boolean positive = number>0;
        boolean negative = number<0;
        boolean isZero = number==0;

        System.out.println(number + " is positive: " + positive);
        System.out.println(number+ " is negative: "+ negative);
        System.out.println(number + " is zero: " + isZero);
    }
}
