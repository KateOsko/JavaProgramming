package day28_arrays;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {

        /* declare and assign an array of numbers
        {3,6,10}
        sum all the numbers in the array
         */

        int  [] num = {3,6,10};
        int sum = 0;

        for(int i = 0; i<num.length; i++){
            sum+=num[i];
        }
        System.out.println(sum);

    }
}
