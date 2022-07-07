package day09_scanner;

public class GoForWalk {

    public static void main(String[] args) {

        /*
        We want to go for a walk
        We will go for a walk if  it's not rainig and the weather is above 70

        There is no need to check the weather if it's raining
         */

        boolean isRaining = true;
        int temperature = 60;

        System.out.println(!isRaining && temperature>70);
    }
}
