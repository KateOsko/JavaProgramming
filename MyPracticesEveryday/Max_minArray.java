import java.util.Arrays;

public class Max_minArray {
    /*
    Write a method that will accept an array of int as an argument and it returns the max/min number from a given array.
     */
    public static int MaxArr(int[] arr) {
        Arrays.sort(arr);


        return arr[arr.length - 1];
    }

    public static int MinArr(int []arr){
        Arrays.sort(arr);
        return arr[0];
    }


    public static void main(String[] args) {
        int [] arr = {4, 781, 8, 99, 103, 99, 85228, 1};
        System.out.println(MaxArr(arr));
        System.out.println(MinArr(arr));
    }
}

