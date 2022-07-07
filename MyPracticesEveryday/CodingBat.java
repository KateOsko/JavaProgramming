import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingBat {
    public static void main(String[] args) {

        int[] nums = {1, 5, 4, 2, 8, 4, 8, 10};
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int[] nums2 = new int[arr2.size()];

        for (int i = 0; i < nums.length; i++) { // array --> length;
            arr.add(nums[i]);
        }

        int pos = arr.lastIndexOf(4);

        for (int i = pos+1; i < nums.length; i++) { // array --> length;
            arr2.add(nums[i]);
        }
                                              // length() --> ArrayList
        for(int i =0; i<arr2.size()-1; i++){ // ArrayList --> size();
            nums2[i] = arr2.get(i);
        }
        System.out.println(Arrays.toString(nums2));
    }
}



