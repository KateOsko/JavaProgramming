package day61_collections_maps;

import java.util.HashMap;
import java.util.Map;

public class ToppingCodingBat {
    /*
    Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".


topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
topping1({}) → {"bread": "butter"}
topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
     */

    public static Map<String, String> topping1 (Map <String, String> map){
        map.put("bread", "butter");

        if(map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }

        if(map.containsKey("pancake")){
            map.put("pancake", "syrup");
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, String> map3 = new HashMap <>();
        map3.put("ice cream", "white");
        map3.put("pancake", "brown");
        map3.put("bortch", "red");
        
        System.out.println(topping1(map3));
    }
}
