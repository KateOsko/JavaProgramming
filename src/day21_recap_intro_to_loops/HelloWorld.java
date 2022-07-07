package day21_recap_intro_to_loops;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hwllo World");
        System.out.println("Hwllo World");
        System.out.println("Hwllo World");
        System.out.println("Hwllo World");
        System.out.println("Hwllo World");

        int num = 1;
        while(num++<100){
            System.out.println("Hello World" + num++);
        }

        int z=1;
        while(z<=50){
            System.out.println("Hello Universe " + z);
            z++;
        }
    }
}
