import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinArray {
    /*
      Array - Find Maximum
      Write a method that can find the maximum number from an int Array
     */

    public static int maxNumber(Integer[] nums) {
        int newNums = 0;

        for (Integer each : nums) {
            if (each > newNums) {
                newNums = each;
            }
        }
        return newNums;
    }

    public static int minNumber(Integer[] nums) {
        int newNums = 0;

        for (Integer each : nums) {
            if (each < newNums) {
                newNums = each;
            }
        }
        return newNums;
    }

    /*
        Array - Sort Ascending
        Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
               Ex:
            int[] arr = {10, 9, 8, 7};
             arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */


    public static void main(String[] args) {

        //Array - Sort Ascending
        Integer[] arr = {3, 6, 11, 4, -9, -34, 67, 1228};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = 0;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        //Descending Array
        Integer[] arr2 = {3, 6, 11, 4, -9, -34, 67, 1228};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] < arr2[j]) {
                    int temp = 0;
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr2));
    }

}




