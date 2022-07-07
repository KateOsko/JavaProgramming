package day27_nested_loops;

public class day27_nested_loops {
    public static void main(String[] args) {
        /*
        Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.
Ex:
	Input:
		50
	Output:
		2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47

         */
        int range = 50;
        for (int i = 2; i <= range; i++) { // the perpose is to check all the numbers from 2 to the value of the range variable
            int count = 0; // resets the number or the next  number

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            } //end of inner loop

            if (count == 0) {
                System.out.print(i + ",");

        /*
        i=5
        j=2; j<5; j++
        5%2
        5%3
        5%4
        ===========

        i=6
        j=2;j<6; j++
        i%j
        6%2 -> count++ // 1
        6%3 -> count++ // 2
        6%4
        6%5
         */

            }


        }
    }
}
