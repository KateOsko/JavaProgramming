package day61_collections_maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(5, "five");
        map.put(10, "ten");
        map.put(2, "two");

        System.out.println(map);


        String value = map.get(5);
        System.out.println(value);


        map.remove(1);
        System.out.println(map);

        map.put(1,"one");

        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(3));

        System.out.println(map.containsValue("five"));
        System.out.println(map.containsValue("eleven"));

    }
}

