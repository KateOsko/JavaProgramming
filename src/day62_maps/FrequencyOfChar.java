package day62_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChar {
    public static void FrequencyOfChar(String str) {

        Map<Character, Integer> counter = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);

            if(counter.containsKey(key)){
                counter.put(key, counter.get(key)+1);

            } else {
                // map doesn't contain the letter, first timr the char was found

                counter.put(key, 1);
            }
        }

        System.out.println(counter);
    }

    public static void main(String[] args) {
        FrequencyOfChar("banana");
    }
}