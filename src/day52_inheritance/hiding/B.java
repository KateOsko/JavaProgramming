package day52_inheritance.hiding;

public class B extends A {

    @Override
    public void instanceMethodA(){
        staticMethod();

        // we can override instance methods
    }

   // @Override
    public static void staticMethod(){
        System.out.println("Static method from the CHILD class");

    }

}
