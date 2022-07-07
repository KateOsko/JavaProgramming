package day08_relational_operators;

public class Speeding {
    public static void main(String[] args) {
       /* declare 3 variables:
        current speed, speed limit, speeding boolean
                print
        "Are you speeding? " true/false
        */

        int currentSpeed = 15;
        int speedLimit = 25;
        boolean speeding = currentSpeed>speedLimit;

        System.out.println(speeding);
    }
}
