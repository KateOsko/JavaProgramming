package array_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacter {
        /*frequency(c,o):
        c – the collection in which to determine the frequency of o
        o – the object whose frequency is to be determined

        write a program that can find the frequency of character from a String
                                        DO NOT use nested loop

                                        "AABBCCDDEE"  ==> "ABCDE"
                                        output: A2B2C2D2E2
         */

    public static void main(String[] args) {
        String str = "AABBCCDDEE";
        String result = "";

        ArrayList<String> arr = new ArrayList<String>(Arrays.asList(str.split("")));

        for (String each: arr){
                int frequency = Collections.frequency(arr, each);
                if(result.contains(each)) { // to avoid duplicated characters in the result
                    continue;
                }
                result += each + frequency;
            }

            System.out.println(result);
        System.out.println(Collections.frequency(arr, "B"));
        }

    }

