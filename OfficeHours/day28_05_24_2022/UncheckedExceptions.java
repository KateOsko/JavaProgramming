package day28_05_24_2022;

public class UncheckedExceptions {
    public static void main(String[] args) {

        // CheckedExceptions.waitFor(3);
        // Since we already handled it CheckExceptions Class permanently this will not compile

        int[] num = {1, 2, 3, 4, 5};
        System.out.println("Test 1 is started");


        try {
            System.out.println(num[10]);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException is handled");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException is handled");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException is handled");


            System.out.println("Test 1 is passed");
        }


    }
}
