package day19_string;

public class Practice {
    public static void main(String[] args) {
        double a = 89.6; //explicit casting
        int b = (int) a;
        System.out.println(b);

        System.out.println("a= " + a);

        //long l=99;//implicit casting because 99 is an int
        long l = 9999999999l;
        int f = (int) l;
        System.out.println("f= " + f);


        double d = 15.2;
        int i3 = (short)d;
        System.out.println("i3 ="+ i3);



    }


}
