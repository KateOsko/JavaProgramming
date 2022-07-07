package day65_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMethods {
    public static void main(String[] args) {

        //creating streams

        int [] arr = {1,2,3,4,5};
        Arrays.stream(arr);

        List<Integer> list = new ArrayList<> (Arrays.asList(4,5,6,7,2));
        list.stream();

        //distinct(): remove duplicates
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,1,2,2,4,4,4,5,5,6,7));
        System.out.println(list2.stream(). distinct(). collect(Collectors.toList()));

        /*
        .stream() converts the list to stream
        .distinct() removes duplicates
        .collect((Collectors.toList()) converts the stream back to List

         */
        System.out.println("origonal list" + list2);

        int [] arr2 = {1,2,2,2,3,4,5,1,2,2,7,6,7,7,8};
        arr2 = Arrays.stream(arr2).distinct().toArray();
        System.out.println("array " + Arrays.toString(arr2));
        System.out.println();

        //skip(): skips the defined numbers of elements
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list3.stream().skip(4).collect(Collectors.toList()));
        System.out.println(list3);
        System.out.println(list3.stream().skip(13).collect(Collectors.toList()));

        System.out.println();

        //limit
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list4.stream().limit(6).collect(Collectors.toList()));
        System.out.println(list4.stream(). limit(5).skip(3). collect(Collectors.toList()));
        System.out.println(list4.stream().skip(3).limit(4).collect(Collectors.toList()));
        System.out.println();

        //count
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,5,6,3,5));
        System.out.println(list5.stream().count());
        System.out.println(list5.stream().distinct().count());

        //Task: find how many different letter there is (no about duplicate)
        String s = "aaabbbccccdddee";
        System.out.println(Arrays.stream(s.split("")).distinct().collect(Collectors.toList()));
        System.out.println(Arrays.stream(s.split("")).distinct().count());

        


    }
}
