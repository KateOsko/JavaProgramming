import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice {

    public static void main(String[] args) {


        Map<String, Double> map = new HashMap<>();
        map.put("Anna", 5.0);
        map.put("Kate", 5567300000.0);
        map.put("Ivan", 78.34);
        map.put("Konstantin", 234.0);
        map.put("Alena", 10027.22);

        String nameMax = "";
        double max = 0;

        String nameMin = "";
        double min = Double.MAX_VALUE;

        for (String key : map.keySet()) {
            if (map.get(key) > max){
                nameMax=key;
                max=map.get(key);
            }

            if(map.get(key) < min) {
                nameMin=key;
                min=map.get(key);
            }
        }

        System.out.println("Max num: " + nameMax + " - $" + max);
        System.out.println("Min num: " + nameMin + " - $" + min);
    }
}
