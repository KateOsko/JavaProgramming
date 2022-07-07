package day39_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {

        Integer [] arr = {1 ,2, 3}; // we made an Integer array because ArrayList doesn't accept primitive types
        Arrays.asList(arr); //converts the array to a collection type (ArrayList)

        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(arr)); //creating an ArrayList with values from collection type
        System.out.println(nums);

        //Creating an ArrayList with some initial values

        ArrayList <Integer> other = new ArrayList<>(Arrays.asList(4,5,6,7));
        //   ArrayList <String> group = new ArrayList<>();
        System.out.println(other);

        ArrayList<Integer> cydeo = new ArrayList<>(Arrays.asList(4,5,6,7)); // converts Array to the ArraysList
    }
}
