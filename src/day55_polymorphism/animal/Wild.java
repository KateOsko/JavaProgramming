package day55_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {

        // all possible references of Lizard

        //itself
        Lizard lizard = new Lizard();
        lizard.eat();
        lizard.name = "lizard";
        lizard.numberofClaws = 10;
        lizard.skinColor = "camo";
        System.out.println(lizard.name);
        System.out.println(lizard.numberofClaws);
        System.out.println(lizard.skinColor);
        System.out.println();

        // super class - reptile
        Reptile reptile = new Lizard();
        reptile.eat();
        reptile.name = "lizard";


        //super class = animal
        Animal animal = new Lizard();
        animal.eat();


    }
}