package day61_collections_maps;

import java.util.*;

public class Countries {

    public static void main(String[] args) {

        Map<String, ArrayList<String>> countries = new HashMap();
        // created a HashMap that has key of String type - countries and ArrayList <String> for values and those will be cities

        countries.put("United States", new ArrayList<>(Arrays.asList("Chicago", "New York", "Dallas", "Chicago", "LA")));

        countries.put("Turkey", new ArrayList<>(Arrays.asList("Istambul", "Ankara", "Izmir")));

        countries.put("Canada", new ArrayList<>(Arrays.asList("Quebec", " Toronto", "Vancouver")));

        System.out.println(countries);

        //Print all cities that starts with D or I
        for (ArrayList<String> cities : countries.values()){
            for(String eachCity:cities){

                if(eachCity.startsWith("D") || eachCity.startsWith("I")){
                    System.out.println(eachCity);
                }

            }
        }

        System.out.println("What country do you want to tour?");
        Scanner input = new Scanner(System.in);
        String country = input.nextLine();

        for(String cities: countries.get(country)){
            System.out.println("Touring ... " + cities);
        }


    }
}
