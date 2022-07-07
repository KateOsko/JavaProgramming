package day44_custom_classes;

public class Employee {
    /*
    create a class called Employee
        - data:
            name, id, job title, salary

        - constructor
            - create a constructor that creates an Employee object with the name and job title
            - create a constructor that creates an Employee object with the name, id, job title, and salary

        - method:
            goToMeeting()
                when this method is called print:
                    $name is going to a meeting

            toString()
                print all the employees information
    Create a separate class to create and test the Employee objects
     */

    String name; // instance variable
    int id; // instance variable
    String jobTitle; // instance variable
    double salary; // instance variable

    public Employee (String name, String jobTitle){
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public Employee (String name, String jobTitle, int id, double salary){
        this(name, jobTitle);
        this.id = id;
        this.salary = salary;
    }

    public void goToMeeting() {
        System.out.println(name + " is going to a meeting");
    }

    @Override
    public String toString() {
        return "Employee:" +
                "name=" + name +
                ", id=" + id +
                ", jobTitle=" + jobTitle  +
                ", salary=$" + salary;
    }
}
