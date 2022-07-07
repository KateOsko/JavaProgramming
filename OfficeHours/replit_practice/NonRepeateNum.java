package replit_practice;

import java.util.Scanner;

public class NonRepeateNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers");
        int[] nums = {input.nextInt()};

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
                if (count == 1) {
                    System.out.println(nums[i]);
                }
            }
        }
    }



