package day26_nested_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        /*
        print multiplication by the numbers 1 to 10
        1X1=1
        1X2=2
        ...
        2X1
        2X2
        ...
        3X1
        ...
        10 x 10
         */



        for (int num = 1; num<=10; num++) {
            for (int multi = 1; multi <= 10; multi++) {
                System.out.print(num + " x " +multi + " = " + (num*multi) + " | ");
            }
            System.out.println("-------------");
        }


    }
}
