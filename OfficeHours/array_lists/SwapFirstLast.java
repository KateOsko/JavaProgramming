package array_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapFirstLast {
    public static ArrayList<Integer> swapFirstLast(ArrayList<Integer> num) {
        Collections.swap(num, 0, num.size() - 1);
        return num;
    }

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 78, 4, 322));

        System.out.println(swapFirstLast(num));

    }
}
