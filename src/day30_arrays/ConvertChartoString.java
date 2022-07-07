package day30_arrays;

import java.util.Arrays;

public class ConvertChartoString {
    public static void main(String[] args) {
        char [] day = {'m', 'o', 'n', 'd', 'a', 'y'};
        System.out.println(day.length);

        String strDay = new String(day);
        System.out.println(strDay);

        String g = "dfhd";
        char [] k = g.toCharArray();
        System.out.println(Arrays.toString(k));


        System.out.println(strDay.toUpperCase());

        String f = "abba";
        String [] fook = f.split("");
        System.out.println(Arrays.toString(fook));


        }
    }

