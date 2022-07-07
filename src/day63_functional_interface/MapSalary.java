package day63_functional_interface;

import java.util.HashMap;
import java.util.Map;

public class MapSalary {
    /*
    /*
Create a map that has a couple data to use. The data will be a name as the key and a salary as the value

Use the created map to find the following:

    1.1 who has the maximum salary?
    1.2 who has the minimum salary?
    1.3 how many employees has the salary between 120k ~ 150K?
    1.4 display the names of the employees who are making less than 118k?
    1.5 increase the salary of each employee by 10K
 */

    public static void main(String[] args) {


        Map<String, Double> map = new HashMap<>();
        map.put("James", 70000.0);
        map.put("Jane", 3000000.0);
        map.put("Ana", 440000000.15);
        map.put("Jorge", 424551.23);
        map.put("Elza", 123131214.1);
        map.put("Peter", 231234.0);

        String nameForLargest = "";
        double maxSalary = 0.0; // we need to know all the salaries that are bigger than this

        String nameForLowest = "";
        double lowestSalary = Double.MAX_VALUE; // if i put 0 --> would the value be ever lower than 0? No. The lowest salary would remain 0 then. Instead of 0 we are putting MAX Value. We want the number be less than MAX. value<lowestSalary so that the value can be lower than MAX to match out end result

        for(String key : map.keySet()){

            double value = map.get(key);

            if(value > maxSalary){
                nameForLargest=key;
                maxSalary = value;
            }

            if(value<lowestSalary) {
                nameForLowest = key;
                lowestSalary = value;
            }
        }
        System.out.println("Max Salary: " + nameForLargest + " - $" + maxSalary);
        System.out.println("Smallest Salary: " + nameForLowest + " - $" + lowestSalary);

        for(String name : map.keySet()){
            if(map.get(name) <= 218_000){
                System.out.println(name);
            }
        }
        System.out.println();

        for(String key : map.keySet()){
            map.put(key, map.get(key) + 10_000);
        }
        System.out.println(map);
    }
}