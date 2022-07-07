package day64_functional_interface;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class Task1 {
    public static void main(String[] args) {
        /*
        1.1 Create a function that can check if two array are equal and contains the same elemnts
                ex: arr1 = {3,2,1}
                    arr2 = {2,1,3}

                output: true
         */


        BiPredicate<Integer[], Integer[]> equalsArr = (arr1, arr2) -> {
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            for (int each : arr1) {
                for (int each2 : arr2) {
                    if (each != each2) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
            return true;
        };

        Integer [] arr1 = {1, 5, 9};
        Integer [] arr2 = {5, 1, 9};
        System.out.println(equalsArr.test(arr1, arr2));

    }
}
