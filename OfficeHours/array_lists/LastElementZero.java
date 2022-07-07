package array_lists;

import java.util.ArrayList;
import java.util.Arrays;

public class LastElementZero {
    /*
    1. write a program that can set the last element of the Integer arraylist to zero
                        ex:
                            list = [1,2,3,4,5];
                            output: [1,2,3,4,0];
     */

    public static ArrayList <Integer> returnZero (ArrayList <Integer> zeroo){
        zeroo.set(zeroo.size()-1, 0);
        return zeroo;

    }

    public static void main(String[] args) {
        ArrayList <Integer> zeroo = new ArrayList <> (Arrays.asList(1,2,3,4,5,66,98,4));
        System.out.println(returnZero(zeroo));

        }
    }

