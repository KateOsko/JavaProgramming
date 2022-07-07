package day22_loops_while_do;

public class Letters {
    public static void main(String[] args) {


// print a-z lowercase

        char lowercaseUp = 'a';

        while (lowercaseUp <= 'z') {

            System.out.print(lowercaseUp + " ");
            lowercaseUp++;
        }

        //Z-A uppercase
        System.out.println();
        char uppercaseBack = 'Z';
        while(uppercaseBack >= 'A'){
            System.out.print (uppercaseBack + " ");
                    uppercaseBack--;
        }
    }
}