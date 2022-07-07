package day09_scanner;

public class LogicalPractice {
    public static void main(String[] args) {
        int n=10;
        System.out.println(n>5);
        System.out.println(n<10);

        System.out.println(n>5 && n<10);

        System.out.println(4>3 || false); //true|| false
        System.out.println(3<4 || false); // false||false

        System.out.println(!false); //true

    }
}
