package day39_array_list;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(100);
        nums.add(500);
        nums.add(800);

        nums.add (100);

        // give first 100
        System.out.println(nums.indexOf(100)); // first occurence of the index of the given element
        System.out.println(nums.indexOf(700));


        //gives last  100
        System.out.println(nums.lastIndexOf(100));

        //middle 100
        nums.set(nums.indexOf(100), 0);  // index Of 100 and it goes to the first index Of 100 and it sets to 0
        System.out.println(nums.indexOf(100));


    }
}
