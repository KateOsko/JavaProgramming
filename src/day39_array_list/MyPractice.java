package day39_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class MyPractice {
    public static void main(String[] args) {

        ArrayList<String> grocery = new ArrayList<>();
        //add
        grocery.add("Apple");
        grocery.add("Banana");
        grocery.add("Pumpkin");
        grocery.add("Kiwi");
        grocery.add("Orange");

        System.out.println(grocery);

        System.out.println("------------------------------------------");
        //size
        System.out.println(grocery.size());

        System.out.println("------------------------------------------");

        // get
        System.out.println(grocery.get(2));
        System.out.println("------------------------------------------");

        //set (index,newElement)
        grocery.set(0,"Berry");
        System.out.println(grocery);

        //remove (int,index)  or remove (object)
        String a = grocery.remove(0);
        System.out.println(a);

        boolean b = grocery.remove("Pumpkin"); // returns boolean
        System.out.println(b);

        // clear
        grocery.clear();
        System.out.println(grocery);
        System.out.println("------------------------------------------");


        //new ArrayList from Array
        String [] boo = {"Hi", "Hello", "Bye", "Goodbye"};
        ArrayList <String> helloo = new ArrayList<>(Arrays.asList(boo));
        System.out.println(helloo);

        //IndexOf(object) --> returns a number (index)
        System.out.println(helloo.indexOf("Hello"));

        int r = helloo.lastIndexOf("Goodbye");
        System.out.println(r);

        System.out.println("------------------------------------------");
 ArrayList <Integer> nums = new ArrayList <>(Arrays.asList(1, 4, 5, 6, 77));
        System.out.println(helloo.contains("Hi"));
        System.out.println(helloo.equals(nums));

        System.out.println("------------------------------------------");
    }
}
