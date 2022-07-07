package day37_wrapper_arraylist;

import java.util.Arrays;

public class Practice_HTML {
    /*
    HTML Generator
Given a String in the following format take the number part of the generator the html tags.
	Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^

	Ex:
		Input:
			div^2
		Output:
			<div></div> <div></div>

	Ex:
		Input:
			li^3
		Output:
			<li></li><li></li><li></li>
     */
    public static void main(String[] args) {

        String s = "div^2";

            String[] splitted = s.split("\\^");
            System.out.println(Arrays.toString(splitted));

            String number = splitted[1];
            String word = splitted[0];
            int resultNumber = Integer.parseInt(number);

            String str = "<" + word + ">" + "</" + word + ">";
            String newStr = "";

            for (int i = 0; i < resultNumber; i++) {
                newStr += str;
            }

            // System.out.println(newStr);

        System.out.println(newStr);
        } //method
    }// class
