package day39_array_list;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);

        nums.set(0,-100);
        System.out.println(nums);

        nums.set(2,50_000);
        System.out.println(nums); // works like replace

    //    nums.set(10,700);  out of bounds since there is no 10 index
    }
}
