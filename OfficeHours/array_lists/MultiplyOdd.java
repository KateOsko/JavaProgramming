package array_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*3. write a program that can multiply each odd number by 2
                        ex: list = [1,2,3,4,5];
                            output: [2,2,6,4,10]*/

public class MultiplyOdd {
    public static ArrayList<Integer> multiplyOdd(ArrayList<Integer> nums) {
        for (int i =0; i<nums.size(); i++) {
            if (nums.get(i)%2!=0) {
                nums.set(i, nums.get(i)*2);
            }
        }
        return nums;

        //if(numbers.get(i)%2==1){
        //                numbers.set(i,numbers.get(i)*2);
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 6, 7, 8, 2, 44, 55, 7));

        System.out.println(multiplyOdd(nums));
    }
}
