package day30_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        char [] letters = {'j', 'a', 'v', 'a'};
        String word = "java"; // converting a String into a char []
        char [] java = word.toCharArray();
        System.out.println(Arrays.toString(java));

        //print every letter in my String

        for (char eachChar : java) { // for(char eachChar : word.toCharArray()){
            System.out.println(eachChar);

        }
        System.out.println(java[0]);
    }
}
