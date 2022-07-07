package day32_multid_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
      /*   int [] n = {4,5,6};
        int [] m = n;
        System.out.println(Arrays.copyOf(n, 3));

        m[3] = 100;
        System.out.println(Arrays.toString(m)); */

        Scanner input = new Scanner(System.in);
        // Ask how many numbers to start with
        System.out.println("How many numbers do you want to start with?");
        int size = input.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) { // the purpose of this loop is to get all the numbers for the array

            System.out.println("Enter a number");
            nums[i] = input.nextInt();
        }

        System.out.println("Array so far" + Arrays.toString(nums));
        int[] expanded = Arrays.copyOf(nums, nums.length + 1);

        System.out.println("Enter the last number");
        expanded[expanded.length - 1] = input.nextInt();
        System.out.println("The final array is: " + Arrays.toString(expanded));
        //TODO: "recap ADD ELEMENT"//

    }
}
