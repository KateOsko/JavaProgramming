package day24_loops_for_loop_practice;

public class Syllables {
    public static void main(String[] args) {
         /*
    Syllables
        Given a String separated by dashes calculate how many syllables the words are
        Ex:
        Input:
        ja-va Output:
        2
     */
       String s = "ja-va-script";
       int syllables = 1;

       for (int i=0; i<s.length(); i++)
           if(s.charAt(i) == '-'){
               syllables++;
           }
        System.out.println("Syllables: " + syllables);

    }
}
