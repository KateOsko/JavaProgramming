package day37_wrapper_arraylist;

public class WrapperClassObject {
    public static void main(String[] args) {

        int a = 5;
        //what can we do with this: assign/reassign, math, casting
        //we can't do this a.method()

        Integer a2 = new Integer(10);
        Integer a3 = 20;

        System.out.println(a);
        System.out.println(a2);
        System.out.println(a3);

        byte b = 2;
        Byte b2 = 20;
    }
}
