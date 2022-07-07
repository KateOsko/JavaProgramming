package day64_functional_interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingThroughMap {
    public static void main(String[] args) {

        Map<Integer, String> map =new LinkedHashMap<>();
        map.put(10,"Arthur");
        map.put(20,"George");
        map.put(30,"Jack");
        map.put(40,"Emma");
        map.put(50,"Isabella");


        //Iterating byKeys
        // keySet(): return all the keys of map (Set)


        for( Integer eachKey : map.keySet() ) {
            System.out.println(eachKey);
        }
        System.out.println("-------------------------------------------");

        // Iterating By Values
        // values(): returns all the values of map (Collection)

        for (String eachValue : map.values()) {
            System.out.println(eachValue);
        }

        System.out.println("-------------------------------------------");



        /*
        Iterating by entries
         */

        for( Map.Entry <Integer, String> eachEntry: map.entrySet()){
            System.out.println(eachEntry.getKey() + " : " + eachEntry.getValue());
        }

    }
}
