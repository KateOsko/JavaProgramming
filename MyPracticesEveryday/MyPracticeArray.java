import java.util.*;

public class MyPracticeArray {
    public static void main(String[] args) {

        // Array
        String[] animals = {"zebra", " elephant", "dog", "dog", "cat", "cat"};
        int[] num = {1, 2, 3, 4};

        //    Integer -> int unboxing   (Object to primitive)
        //    int -> Integer autoboxing (primitive type to Object class)


        //ArrayList
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(animals));
        ArrayList<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            arr2.add(num[i]);

        }
        System.out.println(arr2);


        //Array
        int[] arr3 = new int[arr.size()];
        //   arr2.toArray();
        for (int i = 0; i < arr2.size(); i++) {
            arr3[i] = arr2.get(i);
        }
        System.out.println(Arrays.toString(arr3));


   //   String[] animals = {"zebra", " elephant", "dog", "cat", "cat"};
        Set <String> strSet = new HashSet<>();
        strSet.addAll(List.of(animals));

        System.out.println(strSet);

    }
    }

