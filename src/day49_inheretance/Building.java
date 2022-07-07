package day49_inheretance;

public class Building {
    public static void main(String[] args) {


        Person obj = new Person();
        obj.name = "James Bond";
        obj.age = 40;
        obj.favHobby = "Spy Stuff";
        obj.talk();
        // can not access study class (child class)

        Student obj2 = new Student();
        obj.name = "Jorge";
        obj.age = 10;
        obj.favHobby = "drawing";
        // inherited from the Person class

        obj2.funLevel = 100;
        obj2.study();


    }
}