package day61_collections_maps;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("james");
        names.add("emre");
        names.add("bruce");
        System.out.println(names);

        // going through the elements and returning each one by one
        Iterator<String> it = names.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        //  System.out.println(it.next()); // there was no element so exception happened


    }
}
