package day39_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    public static void main(String[] args) {

        ArrayList <String> listOne = new ArrayList<>();
        listOne.add("hello");
        listOne.add("bye");
        System.out.println(listOne);


        ArrayList<String> listTwo = new ArrayList<>(listOne);
        System.out.println(listTwo);

        listTwo.add("Hola");
        System.out.println(listOne);
        System.out.println(listTwo);

        listTwo.set(0,"Holaaas");
        System.out.println(listTwo);
        System.out.println();

        ArrayList <String> listThree = new ArrayList<>(Arrays.asList("one","two", "three"));
        System.out.println(listThree);
    }
}
