package replit_practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrintShortestWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str = scan.nextLine();

        String[] arr = str.split(", ");
        String sameSize = "";
        String shortest = arr[0];

       for (String eachword : arr){
           if (eachword.length() < shortest.length()){
               eachword=shortest;
            }
        }

        for (String eachword : arr) {
            if (eachword.length() == shortest.length()) {
                sameSize += eachword + " ";
            }
        }

        String [] newArr = sameSize.split(" ");
        System.out.println(Arrays.toString(newArr));


    }
}




