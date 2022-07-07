package day62_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseExample {
    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();
        map.put("FIRST_NAME", "James");
        map.put("LAST_NAME", "Bond");
        map.put("BATCH", "7");

        System.out.println(map);

        //List<String> list of String elements
        List<Map<String,String>> list = new ArrayList<>();
        list.add(map);
       // data.add(makeMap("Shina" , null, "26"));
    }
}
