package day42_custom_classes;

import java.util.Scanner;

public class UsingApp {
    public static void main(String[] args) {
        App cydeo = new App();
        cydeo.name = "Cydeo";
        cydeo.version = 5.5;
        cydeo.isFree = true;

        //we can not call instance methods like this. they are not static
        // App.run();
        //App.update();

        cydeo.run();
        cydeo.update();

        System.out.println(cydeo.version); // 6.6

        new App().run(); // null is running, no reference

        System.out.println(new Scanner(System.in).nextLine()); // no reference, no input
    }
}
