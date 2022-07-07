package day13_if_statement;

public class MyPractice {
    public static void main(String[] args) {
        int a=1;//0 ->1 ->0 ->-1
        a=-a--+a++/-a--*--a;
        System.out.println(a);

        int h =5;
        int p =h;

        h++;
        System.out.println("----------------------------");
        System.out.println("h : " + h);
        System.out.println("p : " + p);

        System.out.println("-----------------------");

        int k = h++;

        System.out.println(k);
        System.out.println(h);

    }
}