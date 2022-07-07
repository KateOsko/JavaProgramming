package day17_string_method;

public class StringMemory {
    public static void main(String[] args) {

        String first = "java"; //String literal, in String pool

        String second = new String("java"); // String object, not in String pool, but directly in the heap

        System.out.println(first==second);
        //gives you false
        //== with String types gives you false. The == doesn't compare the characters, it compares the memory location of the object. COMPARES THE OBJECTS

        String third = "java";
        System.out.println(first==third);

        String fourth = "Java"; //at this line, how much object in the String pool 2
        // you have "java" "Java"

        System.out.println(first==fourth);

        String fifth = new String("java");
        System.out.println(second==fifth);

    }
}
