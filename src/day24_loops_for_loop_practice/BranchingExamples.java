package day24_loops_for_loop_practice;

public class BranchingExamples {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            if (i == 5) {
                break;
            }
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                break;
            }
        }

        System.out.println();
        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i + " ");

        }
        //break stops the loop
        // continue skips what's in the parenthesis (odd numbers) It cotinues printing even numbers
    }

}

