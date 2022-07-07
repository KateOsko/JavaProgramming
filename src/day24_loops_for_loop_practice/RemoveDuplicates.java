package day24_loops_for_loop_practice;

public class RemoveDuplicates {
    public static void main(String[] args) {
         /*
        Remove Duplicates
            Write a program that can remove duplicates from a String Ex:
            Input: abcabc Output: abc
         */
        String s = "abcabc";
        String unique= "";
        for (int i=0; i<s.length(); i++){
            if (!unique.contains ("" + s.charAt(i))){
                unique += s.charAt(i);
            }
        }

        System.out.println(unique);

    }
}