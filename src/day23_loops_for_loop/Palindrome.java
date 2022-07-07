package day23_loops_for_loop;

public class Palindrome {
    public static void main(String[] args) {
    /*Palindrome: its the same reading from the beginning and end

    ex:
        mom
        racecar
        anna
        madam

        Task: Check if a word is palindrome */

    String str ="abcde";

    //reverse the String
    String reverse = "";
    for (int i = str.length()-1; i>=0; i-- ){
        reverse+=str.charAt(i); // characters are being read from the end and being added backward into a reverse String

    }
 if(str.equals(reverse)) {
     System.out.println("Palindrome");
 }else{
     System.out.println("Not Palindrome");
 }

        System.out.println(str.equals(reverse)? "Palindrome" : "Not Palindrome");
    }
}

