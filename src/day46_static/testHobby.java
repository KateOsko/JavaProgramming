package day46_static;

import java.util.ArrayList;

public class testHobby {
    /*
            Create a separate class to create and test the Hobby objects

                - create an ArrayList of Hobby objects
                - create and add a couple Hobby objects
                - iterate through the ArrayList and execute the doIt() method on each Hobby object
                - create a copy ArrayList and remove all outdoors Hobbies
                - create a copy ArrayList and remove all hobbies requiring other people
                - create a copy ArrayList and remove all hobbies that cost more than $500 annually

        Q: What is some difference between Array and ArrayList
        Q: How does our custom class objects work with ArrayList
        Q: What is an object
        Q: How does removeIf method work
        Q: How does Arrays.asList method work
     */

    public static void main(String[] args) {
        Hobby hobby1 = new Hobby("Painting", 120, false, true);

        ArrayList<Hobby> allHobbies = new ArrayList<>();
        allHobbies.add(new Hobby("Swimming", 500, false, false));
        allHobbies.add(new Hobby("Soccer", 650, true, true));
        allHobbies.add(new Hobby("Baseball", 0, true, true));
        allHobbies.add(new Hobby("Yoga", 25, true, false));
        allHobbies.add(new Hobby("Hiking", 700, true, false));
        allHobbies.add(new Hobby("Dancing", 500, false, false));


        //iterate through the ArrayList and execute the doIt() method on each Hobby object
        for (Hobby each : allHobbies) {
            //System.out.println(Arrays.asList(each.Doing()));
        }

        //create a copy ArrayList and remove all outdoors Hobbies
        ArrayList<Hobby> noOutdoors = new ArrayList<>(allHobbies);
        noOutdoors.removeIf(each -> each.isOutdoors);
        //System.out.println(noOutdoors);


        //create a copy ArrayList and remove all hobbies requiring other people
        ArrayList<Hobby> noOtherPeople = new ArrayList<>(allHobbies);
        noOtherPeople.removeIf(each -> each.requiresOthers);
        //System.out.println(noOtherPeople);

        //create a copy ArrayList and remove all hobbies that cost more than $500 annually
        ArrayList <Hobby> moreThan500 = new ArrayList<>(allHobbies);
        moreThan500.removeIf(each -> each.cost>=500);
        System.out.println(moreThan500);



        //System.out.println(allHobbies);

    }
}
