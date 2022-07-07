package day36_methods_overload;

public class Painter {
    public static void main(String[] args) {
        Picture.draw(); // no parameters so it's using the first method
        /*
        public static void draw () {
        System.out.println("trying to draw"); }
         */

        Picture.draw(100); // it will run the method with int
        /*
        public static void draw(int size){
        System.out.println("drawing with size " + size); }
         */

        Picture.draw("red");
        /*
        public static void draw (String color){
        System.out.println("draw with " + color); }
         */

        Picture.draw("blue", "green");
        /*
        public static void draw (String color, String color2) {
        System.out.println("drawing with color " + color + " and with " + color2);}
         */

        String s = "200";
        Picture.draw(s);
    }
}
