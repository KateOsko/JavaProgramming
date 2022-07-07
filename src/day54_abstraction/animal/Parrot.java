package day54_abstraction.animal;

public class Parrot extends Bird implements Flyable {

    @Override
    public void eat() {
        System.out.println("Parrot wobble over to the seeds");
    }

    @Override
    public void fly(){
        System.out.println("Parrot is flying");
    }
}

