package day18_string_methods;

public class RecapMethods {
    public static void main(String[] args) {

        String s = "iamsohappy"; //String literal

        String s2 = new String("pen"); // This object is in the heap because it's new

        //they are different objects

        System.out.println("Compare with == " + (s == s2));
        System.out.println("Compare with .equals() " + (s.equals(s2))); // this method doesn't care about what objects the variables have. it compares just the value

        System.out.println("Compare with .equals()" + s.equals("Pen"));
        System.out.println("Compare with .equalsIgnoreCase" + s.equalsIgnoreCase("Pen"));

        boolean isSame = s.equalsIgnoreCase("PEN");
        if (s.equals("pen")) {
        }

        System.out.println("\n");

        int len = s.length();
        System.out.println(len);

        //int a=9;
        //a.length()-> invalid
        //a.equals() -> invalid

        // You can store it to a variable int.


        if(s.length()>4){
            System.out.println("long word");
        }else{
            System.out.println("short word");
        }
    }
}
