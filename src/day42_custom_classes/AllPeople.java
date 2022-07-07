package day42_custom_classes;

public class AllPeople {
    public static void main(String[] args) {

        Person personOne = new Person(); //creates an object of the Person class

        Person persontwo = new Person();

        //Accessing the instance variables

        personOne.name = "Katya";
        personOne.age = 31;
        personOne.height = 5.8;
        personOne.isMarried = true;

        // printing the instance variables
        System.out.println(personOne.name);
        System.out.println(personOne.age);
        System.out.println(personOne.height);
        System.out.println(personOne.isMarried);

        //printing the instance variables for personTwo

        System.out.println();

        System.out.println(persontwo.name);
        System.out.println(persontwo.age);
        System.out.println(persontwo.height);
        System.out.println(persontwo.isMarried);


    }

}
