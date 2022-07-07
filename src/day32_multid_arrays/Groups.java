package day32_multid_arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String [][] cydeo = new String[4][3]; // 2 dimentional array has a size of 4
        // there are 3 indexes in each of 4 one dimentional arrays --> the size of the inner Arrays
        System.out.println(Arrays.deepToString(cydeo));

        String [][] cydeo1 = new String[4][]; // if we leave the second one empty --> that means the inner arrays will have a flexible size

        String [] groupOne = {"Emre", "Yasir", "Eda"};
        cydeo [0] = groupOne;
        System.out.println(Arrays.deepToString(groupOne));

        System.out.println("Adding group two");

        String [] groupTwo = {"Kate", "ROberto", "Anna"};
        cydeo[1] = groupTwo;
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("Adding group 3");
        cydeo[2] = new String [] {"Adam", "Ksenia", "Al"};
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("same group 3 as group 4");
        cydeo[3] = cydeo[2];

        System.out.println(Arrays.deepToString(cydeo));

            for(String[] innerArray : cydeo){ //loops through the 2D array cydeo
            for(String eachWord: innerArray) { // loops through each element of 1D array
                System.out.println(eachWord);
            }
        }


    }
}
