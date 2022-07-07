package day06_arithmetic_operators;

public class BasicCalculator {
    public static void main(String[] args) {

        double num1 = 5;
        double num2 = 4;

        double add = num1+num2;
        double sub = num1-num2;
        double multiplication = num1*num2;
        double div = num1/num2;
        double remainder = num1%num2;

        System.out.println(add);
        System.out.println(sub);
        System.out.println(multiplication);
        System.out.println(div);
        System.out.println(remainder);

        System.out.println(num1+ " + " + num2 + " = " + add);
        System.out.println(num1+ " - " + num2 + " = " + sub);
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
    }
}

/*
10/3=3.33333
how many times 3 can go into 10?

3+3+3=9
10-9 = 1 --> that's the remainder
 */
