package day58_exceptions.my_practice;

public class Runner {
    public static void main(String[] args) throws InvalidColorException {

        Pen obj1 = new Pen();
        obj1.inkColor = "blue";
        obj1.inkLevel = 25;

        obj1.write();
        System.out.println(obj1.inkLevel);

        obj1.changeColor("black");
        System.out.println(obj1.inkColor);


    }

}
