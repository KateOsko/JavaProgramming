package day65_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Recap {
    public static void main(String[] args) {
        /*
        /*
        1.1 Create a function that can check if two array are equal and contains the same elemnts
                ex: arr1 = {3,2,1}
                    arr2 = {2,1,3}

                output: true

         */

        BiPredicate<int[], int[]> arrayIsEqual = (arr1, arr2) -> {

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        };

        int[] arr1 = {3, 2, 1};
        int[] arr2 = {2, 1, 3};

        System.out.println(arrayIsEqual.test(arr1, arr2));
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        /*
         1.2 Create a function that can check if the first array contains all the elemnts of the second array:
                ex: arr1 = {1,2,3,4,5,6}
                    arr2 = {7,8}

                output: false
         */

        BiPredicate<int[], int[]> firstContains = (arr3, arr4) -> {

            String str = Arrays.toString(arr3);

            for (int outer : arr2) {
                boolean check = false;

                for (int inner : arr1) {
                    if (outer == inner) {
                        check = true;
                        break;
                    }
                }

                if(!check){
                    return false;
                }

            }
            return true;
        };

        int [] arr3 = {1,2,3,4,8,7};
        int [] arr4 = {7,8,10};

        System.out.println(firstContains.test(arr3,arr4));
        System.out.println();



        // merge two arrays into a list
        // first two generics are for parameters
        //last generic is for the return type

        BiFunction<int [], int [], List<Integer>> mergeToList = (arr5, arr6) ->{
            List <Integer> list = new ArrayList<>();

            for (int i = 0; i < arr5.length; i++) {
                list.add(arr5[i]);
                list.add(arr6[i]);
            }
            return list;
        };

        int[] arr5 = {1,2,3};
        int[] arr6 = {4,5,6};
        System.out.println(mergeToList.apply(arr5, arr6));

    }
}

