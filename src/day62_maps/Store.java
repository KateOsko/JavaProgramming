package day62_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Map<String, Double> store = new HashMap<>();
        store.put("Water", 1.5);
        store.put("Coffee", 2.5);
        store.put("Apples", 0.99);
        store.put("Bread", 2.35);
        store.put("Cucumbers", 3.89);

        System.out.println("Store Inventory");

   //    retunrs the set of keys, then we use those keys to get info from the map
        for (String each: store.keySet()){
            System.out.println("\tItem " + each + " for $" + store.get(each));
        } // using get method from the Map to get the value based on the key

        //returning the entry (keyValues pairs) from the map)
        for (Map.Entry<String, Double> each : store.entrySet()) {
            System.out.println("\tItem " + each.getKey() + " for $" + each.getValue());
        }
            System.out.println(store.values());

//        Scanner input = new Scanner(System.in);
//        System.out.println("What item do you want");
//        String item = input.nextLine();
//
//        System.out.println(store.containsKey(item) ? item + "is in stock" : " not available in the store");

        System.out.println("===============================");
        HashMap <String, Integer> happy = new HashMap ();
        happy.put("a", 10);
        happy.put("b", 3);
        happy.put("c", 88);

        System.out.println(happy);
        System.out.println(happy.get("c"));
        }
    }
