import java.util.Arrays;

public class ConcatTwoArrays {
    /*
    Write a return method that can conc two arrays
     */

    public static String [] concatTwoArray(String[] arr1, String[] arr2) {

        int lengthArr1 = arr1.length;
        int lengthArr2 = arr2.length;

        int newLength = arr1.length + arr2.length;

        String[] newArr = new String[newLength];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }

      return newArr;
    }


    public static void main(String[] args) {
        String[] arr1 = {"hello", "me", "world"};
        String[] arr2 = {"happy", "rain", "water"};

        System.out.println(Arrays.toString(concatTwoArray(arr1, arr2)));
    }

}
