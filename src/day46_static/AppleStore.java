package day46_static;

import day43_custom_classes.Phone;

public class AppleStore {

    public static void main(String[] args) {
        Iphone phone = new Iphone("iphone X", 1000);
        System.out.println(phone);

        Iphone phone2 = new Iphone("Iphone 11", 1200);
        System.out.println(phone2);

        System.out.println(Iphone.company);
        System.out.println(Iphone.os);
    }
}
