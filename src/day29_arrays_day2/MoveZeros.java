package day29_arrays_day2;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        /*
    Move Zeros
    Write a program that will move all the zero numbers to the end of the array. The rest of the numbers will move over in position
    Hint: You don’t have to manipulate the given array, try to use another array too. Think about the indexes
    Ex: Input:
    [10, 0, 5, 0, 1, 0]
    Output:
    [10, 5, 1, 0, 0, 0]
     */

        int[] nums = {10, 0, 5, 0, 1, 0, 5, 9, 8, 77, 53};
        int[] fixed = new int[nums.length];
        int index = 0;

        for(int i = 0; i<nums.length; i++){
            if (nums[i]!=0){
               fixed[index]=nums[i];
               index++;
            }
        }
//        for (int each : nums) {
//            if (each != 0) {
//                fixed[index] = each;
//                index++;
//            }
//        }
        System.out.println(Arrays.toString(fixed));

    }
}