package day47_encapsulation;

public class Phone {

    public Phone(){
        System.out.println(1);
    }

    public Phone (int num){
        this();
        System.out.println(2);
    }

    public Phone (String str){
        this(str.length());
        System.out.println(3);
    }
}
