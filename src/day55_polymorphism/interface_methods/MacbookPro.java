package day55_polymorphism.interface_methods;

public class MacbookPro implements Mac {
    @Override
    public void turnOn(){
        System.out.println("Mac is runnign on");

    }
}

class Runner {
    public static void main(String[] args) {
        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);
     //   System.out.println(Mac.NAME);
     //   System.out.println(Mac.NAME);

    }
}
