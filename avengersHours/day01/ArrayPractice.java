package day01;

import java.util.Arrays;

public class ArrayPractice {
    /* Write a method that accepts an array and return true if 6 appears as either the first or last element in the array.

         int[] x = {1,2,6};  ---> true
         int[] y = {6,3,5,7,9};  ---> true
         int[] z = {2,6,6,6,6,1};  ---> false
*/
    public static void main (String[]args){
        int [] nums = {6,2,4,5,6,7};
        System.out.println(firstLast(nums));
    }



    public static boolean firstLast (int [] nums){
        if (nums[0]==6 || nums[nums.length-1]==6) {
            return true;
        } else {return false;}

        }
    }

