package day42_custom_classes;

public class UseRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.base = 10.0;
        rectangle1.height = 5.0;

        rectangle1.calculatePerimeter(4);
        rectangle1.calculateArea(5,10);

        System.out.println(rectangle1);
    }
}
