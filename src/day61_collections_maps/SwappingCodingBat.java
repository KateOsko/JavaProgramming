package day61_collections_maps;

import java.util.HashMap;
import java.util.Map;

public class SwappingCodingBat {
    public static Map<String, String> mapBully (Map<String, String> map){
        if (map.containsKey("a")){
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    public static void main(String[] args) {
        Map <String, String> map = new HashMap<>();
        map.put("b","Apple");
        map.put("c", "candy");

        System.out.println(mapBully(map));
    }
}
