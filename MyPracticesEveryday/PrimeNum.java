import java.util.Scanner;

public class PrimeNum {
    /*
    Prime number is the one that is divisible by 1 and by itself only

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        boolean isPrime = num>=2;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime ) {
            System.out.println("Prime");
        } else {
            System.out.println("isn't Prime");

        }
    }
}



