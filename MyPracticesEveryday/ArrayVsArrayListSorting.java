import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayListSorting {
    public static void main(String[] args) {

        int[] nums = {1, 4, 3, 67, 91, 200}; // 1 3 4

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {

                int temp = 0;

                if (nums[i] > nums[j]) { //4>3
                    temp = nums[i]; // temp = 4
                    nums[i] = nums[j];//num[i]=3
                    nums[j] = temp; // num[j]=4
                }
            }
        }
        System.out.println(Arrays.toString(nums));


        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 5, 3, 12, -3, 9828));
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {         // if (nums[i] > nums[j]) {
                    Integer temp = arr.get(i);  //12      // temp = nums[i];
                    arr.set(i, arr.get(j));  // i=-3           // nums[i] = nums[j];
                    arr.set(j, temp);        // 12
                }
            }
        }
        System.out.println(arr);

    }

}
