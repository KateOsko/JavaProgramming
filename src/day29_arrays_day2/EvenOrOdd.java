package day29_arrays_day2;

public class EvenOrOdd {
    public static void main(String[] args) {
        /*
    Even and odd from array
    Write a program that can count the even and odd number from an array of integers
    Ex:
    Input: [4,1,3,12,5]
    Output: Even: 2
    Odd: 3
     */

        int nums[] = {4,1,3,12,5};
        int even = 0;
        int odd = 0;
        String evenNum = "";
        String oddNum = "";

//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] %2 == 0) {
//                even++;
//                evenNum += nums[i] + " ";
//            } else{
//                odd++;
//                oddNum +=nums[i] + " ";
//            }
//        }

        for (int number:nums){
            if(number %2==0) {
                even++;
                evenNum += number + " ";
            } else{
                odd++;
                oddNum +=number+ " ";

            }
        }
        System.out.println("Even counter: " + even);
        System.out.println("Even numbers: "+evenNum);

        System.out.println("Even counter: " + odd);
        System.out.println("Even numbers: "+oddNum);


    }
}
