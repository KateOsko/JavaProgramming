package array_lists;

import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {
        int [] x = {1,2,3,4,5};
        int temp = x[0]; //--> temporary variable, later I will put it in the last index

        for (int i = 0; i <x.length-1 ; i++) {
            x[i] = x[i + 1];
            x[x.length - 1] = temp; //first index to the last index since int temp = x[0] which is the first index
            System.out.println(Arrays.toString(x));
        }
    }

}
