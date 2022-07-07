import java.util.Arrays;

public class RetunrZeroArray {
    /*
            4)Array - Move Zeros to the End
            Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
            Ex:
            input:  {1,0,2,0,3,0,4,0};
            output: [1, 2, 3, 4, 0, 0, 0, 0]
     */

    public static void moveZeroArray (int [] nums) {
        int[] fixed = new int[nums.length];
        int index = 0;

        for (int each : nums) {
            if (each != 0) {
                fixed[index] = each;
                index++;
            }
        }
        System.out.println(Arrays.toString(fixed));

    }

    public static void main(String[] args) {
        int[] nums = {10, 0, 5, 0, 1, 0,0,0, 0, 5, 9, 8, 77, 53};
        moveZeroArray(nums);
    }
}

