package replit_practice;

public class LoopShape {
    public static void main(String[] args) {
        char a = '*';

        for (int i = 0; i <=5; i++) {
            System.out.print(""+a);
            for (int j = 0; j <i; j++) {
                System.out.print(""+a);
            }
            System.out.println();


        }
    }
}
