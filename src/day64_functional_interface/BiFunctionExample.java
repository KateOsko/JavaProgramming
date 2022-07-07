package day64_functional_interface;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

        BiFunction <Integer, Integer, Integer> maxNumber = (one,two) -> {
            return one>two ? one : two;
        };

        System.out.println(maxNumber.apply(5,2));

        /*
        List<Integer --> keys --> first parameter
        List<String> --> values --> second param

         */

        BiFunction <List<Integer>, List<String>, Map<Integer, String>> createMap = (keys, value) -> {
            Map <Integer, String> map = new HashMap<>();

            for (int i = 0; i <keys.size() ; i++) {
                map.put(keys.get(i), value.get(i));
            } return map;
        };

        List <Integer> keys = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<String> values = new ArrayList<>(Arrays.asList("James", "Ana", "Emre", "Gina"));

        System.out.println(createMap.apply(keys, values));
    }
}
