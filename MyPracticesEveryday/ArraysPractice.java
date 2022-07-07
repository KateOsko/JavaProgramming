import java.util.ArrayList;
import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        int [] nums = {1,55,77};
        int [] nums2 = new int [nums.length];
        System.out.println(java.util.Arrays.toString(nums));

        ArrayList<Integer> nums3 = new ArrayList<>(java.util.Arrays.asList(1,4,77));
        ArrayList<Integer> nums4 = new ArrayList<>(Arrays.asList(1,4,77));
        System.out.println(Arrays.asList(nums3));
        System.out.println(Arrays.asList(nums4));

    }
}
