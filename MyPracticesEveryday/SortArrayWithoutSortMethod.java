import java.util.Arrays;

public class SortArrayWithoutSortMethod {

    public static void main(String[] args) {
        int[] nums = new int[6];
        nums[0] = 567;
        nums[1] = 33;
        nums[2] = -1;
        nums[3] = 98;
        nums[4] = 35;
        nums[5] = -9833;


     //   [567, 33, -1, 98, 35, -9833]
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int temp = 0;
                if (nums[i] < nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));



    }
}


