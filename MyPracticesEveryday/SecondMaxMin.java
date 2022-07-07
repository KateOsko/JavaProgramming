import java.util.Arrays;

public class SecondMaxMin {

    public static int SecondMax(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public static int SecondMin(int[] arr) {
        Arrays.sort(arr);
        return arr[1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 54, 8, 99, 85227, 99, 85228, 2};
        System.out.println(SecondMax(arr));
        System.out.println(SecondMin(arr));
    }
}