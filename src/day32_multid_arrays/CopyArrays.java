package day32_multid_arrays;

import java.util.Arrays;

public class CopyArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = a; // new object but the same array

        a[0] = 100;
        b[1] = 200;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println();

        int[] z = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(z));

        z[0] = 500;
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("z: " + Arrays.toString(z));

        //TODO: return here


    }
}
