package day36_methods_overload;

public class Picture {
    public static void draw() {
        System.out.println("trying to draw");
    }

    public static void draw(String color) {
        System.out.println("draw with " + color);
    }

    public static void draw(String color, String color2) {
        System.out.println("drawing with color " + color + " and with " + color2);
    }

    public static void draw(int size) {
        System.out.println("drawing with size " + size);
    }

   /* public static void draw (int length){
        System.out.println("drawing with size " + length); */
    //not valid just by changing the name parameters. (int/int in both methods). Its only working when the types are different ot more than one that you used in the past

    public static void draw(String color, int size) {
        System.out.println("color with size");
    }

    public static void draw(int size, String color) {
        System.out.println("color with size");
    } // even if the order is different, it's still a different method and it's valid

}

