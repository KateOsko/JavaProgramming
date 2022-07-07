package day28_arrays;

public class MaxMin {
    public static void main(String[] args) {
       /* declare and assign an array
        500, 120, -80, 90, 250, - 10
        find the biggest number in the array
        find the smallest number in the array */

        int [] nums = {500,120,-80,90,250,-100};
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {

            int number = nums[i];

            if(number>max){ //if num[i] >max
                max = number; // max = nums[i]
            }
            if(number<min){
                min = number;
            }
        }
        System.out.println("max" + max);
        System.out.println("min" + min);


    }
}
