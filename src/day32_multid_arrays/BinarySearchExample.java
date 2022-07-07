package day32_multid_arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int [] nums = {4,10,30,100};
        System.out.println(Arrays.binarySearch(nums,4));
        System.out.println(Arrays.binarySearch(nums, 100));
        System.out.println(Arrays.binarySearch(nums,400)); // doesn't exist returns -5
        System.out.println(Arrays.binarySearch(nums,6)); // doesnt exist but would be on the 2 index, returns -2
    }
}
