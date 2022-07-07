package day26_nested_loops;

public class NestedLoopExample {
    public static void main(String[] args) {

        for (int i=0; i<5; i++) {                     ///  1 time
            System.out.println("Hello World");

            for (int j = 0; j < i; j++) {             ///  3 times
                System.out.println("Hello Universe");

            }
            System.out.println("");
        }





        }
    }