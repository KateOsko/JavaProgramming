package day32_multid_arrays;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        /*
        give 2D Array

        average of each inner array
        average of whole array
         */

        double[][] nums = {
                {1, 5, 7},
                { 5, 8, 2},
                {77, 882, 1},
        };

        double total = 0;
        int totalLength = 0;

        for(double[] eachArray:nums){
            double sum = 0;

        for (double eachNum : eachArray) {
            sum+=eachNum;
        }

            System.out.println(Arrays.toString(eachArray) + " the average is: " + (sum/eachArray.length));
        total+=sum;
        totalLength+=eachArray.length;

    }

        System.out.println("Average of the whole 2D array: " + (total/totalLength));

}
}
