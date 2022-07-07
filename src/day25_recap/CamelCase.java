package day25_recap;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        /*Camel Case

        Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

Ex:
	Today is SUNDAY
	Output:
	todayIsSunday*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String str = input.nextLine().toLowerCase();

        String camelcase = str.substring(0,1);

        for (int i = 1; i < str.length(); i++) { // starting from 1 because the next statement in the if i-1

            if(str.charAt(i-1) == ' ') {
                camelcase+= (" "+ str.charAt(i)).toUpperCase(); // made it a string by ()

            } else {
                camelcase +=str.charAt(i);
            }
            }

        System.out.println(camelcase.replace(" ", ""));

        }

       /*  String camelCase = str.substring(0,1); // since we don't have the first character printed at the end because we start i=1

        for (int i = 1; i < str.length(); i++) { // we start from 1 because later in the if statement --> i-1
            if (str.charAt(i - 1) == ' ') {
                //each character cheacking what's before it
                camelCase += str.substring(i,i+1).toUpperCase();
            // .toUpperCase(). sub(i,i+1) is the same as charAt(i) but the types are different
            } else {
                camelCase += str.charAt(i); //today
            }
        }

        System.out.println(camelCase.replace(" ","")); // delete the spaces
    } */
    }

