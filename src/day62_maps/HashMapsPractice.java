package day62_maps;

import java.util.HashMap;

public class HashMapsPractice {
    public static void main(String[] args) {

        HashMap<String, String> fun = new HashMap<>();
        fun.put("bobby", "Fluffy");
        fun.put("HelloKitty", "AloeVera");
        fun.put("coolguy", "passwprd123");

        System.out.println(fun);

        System.out.println(fun.containsKey("HelloKitty")); // fun.containsValue

        System.out.println(fun.replace("bobby", "hi"));
        System.out.println(fun);
        System.out.println("=================================");
        System.out.println(fun.values());
        System.out.println(fun.keySet());
    }
}
