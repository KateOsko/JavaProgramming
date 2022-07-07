package day39_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveByObject {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);

        nums.remove(0);
        System.out.println(nums);

        Integer i = 500;
     // nums.remove(500);  this will go out of Bound, it's not a valid index
        nums.remove(i);
        System.out.println(nums);

        nums.remove(Integer.valueOf(200)); // will give a wrapper class
        System.out.println(nums);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        numbers.remove(Integer.valueOf(4));
        System.out.println(numbers);

    }
}
