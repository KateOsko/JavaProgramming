import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IntegerArrayList {

    /*
    Write method which will return an Integer ArrayList.
    This method should accept and int array.
    Please return the non-duplicate numbers from the array
   */

    public static ArrayList<Integer> nonDuplicates(int[] nums) {
        ArrayList<Integer> nums2 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == 1) {
                nums2.add(nums[i]);
            }
        }
        return nums2;
    }


    public static void main(String[] args) {
        int[] nums = {2,2,2,2,4,4,4,4,6,8,1};
        System.out.println(nonDuplicates(nums));
    }
}
