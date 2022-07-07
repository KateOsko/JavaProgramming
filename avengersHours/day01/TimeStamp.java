package day01;

import java.util.ArrayList;
import java.util.Arrays;

public class TimeStamp {

        public static void main (String[]args){
            System.out.println(timeStamp("10/10/2022 14:59:00"));
        }

        /*Task 01(String):
           Write a method that accepts a String (date with time) and creates a timeStamp for your
           automation report

           String date= "10/10/2022 14:59:00";
           timeStamp(date); // 10102020145900 */

        public static String timeStamp (String date){
            String[] datee = date.split("");
            ArrayList<String> dateee = new ArrayList<>(Arrays.asList(datee));
            dateee.removeAll(Arrays.asList("/", ":", " "));
            String str="";
            for (String each : dateee) {
                str+= each;
            }
            return str;

        }
    }


