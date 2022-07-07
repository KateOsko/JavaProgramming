package day33_methods;

public class Car {
    /*
        unlock
        open car
        sit in the car
        close the door
        put on seatbelt
        start the engine
        put into drive and go
     */

    public static void unlockCar(){
        System.out.println("Unlocking the car");
    }

    public static void openDoor(){
        System.out.println("Opening the door");
    }

    public static void sitInCar(){
        System.out.println("Sitting in the car");
        System.out.println("Closing the door");
    }

    public static void getReadyToGo(){
        System.out.println("Putting on seatbelt");
        System.out.println("Check mirrors");
        System.out.println("Put on music");
        System.out.println("Put on navigation");
    }

    public static void startCar(){
        System.out.println("Start the car");

    }

    public static void goInHurry(){ //multiple methods in goInHurry method
        unlockCar();
        sitInCar();
        startCar();
    }

    public static void main(String[] args){
        unlockCar();
        unlockCar();
        openDoor();
        sitInCar();
        getReadyToGo();
        startCar();

        System.out.println();

        goInHurry();
        System.out.println("hear police siren");
        getReadyToGo();
    }



}
