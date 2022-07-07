package array_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FifthBiggestNumber {
    public static void main(String[] args) {
        /*
     write a program that can return the nth largest number from an arraylist

                    			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
                    			n = 5

                    			output:
                    				4
         */

        ArrayList<Integer> num = new ArrayList <> (Arrays.asList(1,2,3,4,5,6,7, 7 ,8, 8));
        System.out.println(Collections.max(num));
    }
}
