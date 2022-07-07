import java.util.Arrays;


    public class StringAnagram {
    /*
      Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:
     */


        public static boolean same(String a, String b) {
            char[] ch1 = a.toCharArray();
            char[] ch2 = b.toCharArray();   // convert string to chars by creating char [] ch1 and use a.toCharArrays method to convert a string into characters

            Arrays.sort(ch1);
            Arrays.sort(ch2);   //sort the characters

            String s1 = "";
            String s2 = ""; //create empty strings to store the iterated characters

            for (char each1 : ch1) {
                s1 += each1;
            }
            for (char each2 : ch2) {
                s2 += each2;//  run for each loop for each char arrays
            }
            return s1.equals(s2);// set them equal to each other to see if they are anagram
        }


        public static void main(String[] args) {
            System.out.println(same("sul", "usn"));
        }
    }

