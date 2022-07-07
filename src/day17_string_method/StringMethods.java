package day17_string_method;

public class StringMethods {
    public static void main(String[] args) {
        String name="ekaterina";
        //how to compare string values? -->> use .equals();
        System.out.println(name.equals("james"));
        System.out.println("cat".equals("dog"));

        String a=new String("hello");
        String b = new String("goodbye");
        String c = new String ("GOODBYE");
        System.out.println(a.equals(b));


        System.out.println(name.length());

        System.out.println(b.equalsIgnoreCase(c));

    }
}
