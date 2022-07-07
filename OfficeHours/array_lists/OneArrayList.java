package array_lists;

import java.util.ArrayList;
import java.util.Arrays;

public class OneArrayList {
    /*
    4. write a program that can combine two String arrays into one arrayList
                        ex:
                            arr1 = {"A", "B", "C"};
                            arr2 = {"D", "E", "F", "G"};
                            list ==> {"A", "B", "C", "D", "E", "F", "G"}

     */

    public static ArrayList <String> lists (ArrayList <String> arr1, ArrayList <String> arr2){

        ArrayList<String> lists2 = new ArrayList<String>();
        lists2.addAll(arr1);
        lists2.addAll(arr2);
        return lists2;
    }

    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<String> (Arrays.asList("A", "B", "C"));
            ArrayList<String> arr2 = new ArrayList<String> (Arrays.asList("D", "E", "F", "G"));
        System.out.println(lists(arr1, arr2));
            }
        }


