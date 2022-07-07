package day52_inheritance.final_example;
//we Can't extends this class since the class was final, it can not be inherited
public class UseFinalExample {

    public static void main(String[] args) {
        System.out.println(FinalExample.PLANET);

        FinalExample obj = new FinalExample(20);
        System.out.println(obj.a);
        System.out.println(obj.b);

       // FinalExample.PLANET = "Mars"; can not since it's final

        FinalExample obj2 = new FinalExample(100);
        System.out.println(obj2.a);
        System.out.println(obj2.b);

    }
}
