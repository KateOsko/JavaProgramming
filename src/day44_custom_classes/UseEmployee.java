package day44_custom_classes;

import day44_custom_classes.Employee;

public class UseEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Aron", "CEO", 3422, 115.000);
    // reference of the object = object


        System.out.println();
        System.out.println(employee1);
        employee1.goToMeeting();



    }

}
