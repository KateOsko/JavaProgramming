package day43_custom_classes;

public class UsingTrafficLight {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Green"); // making an object from the class


        System.out.println(light.color);

        TrafficLight  light2= new TrafficLight("Red");
        System.out.println(light.color);
        light2.color = "Yellow";

    }
}
