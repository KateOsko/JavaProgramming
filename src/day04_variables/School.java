package day04_variables;

public class School {

    public static void main(String[] args) {
    int grade1 = 20;
        byte grade2 = 25;
        byte grade3 = 30;
        byte grade4 = 40;
        byte grade5 = 45;
        System.out.println("Number of student in grade1 is: " + grade1);
        System.out.println("Number of student in grade2 is: " + grade2);
        System.out.println("Number of student in grade3 is: " + grade3);
        System.out.println("Number of student in grade4 is: " + grade4);
        System.out.println("Number of student in grade5 is: " + grade5);


        int numberofstudents = grade1+grade2+grade3+grade4+grade5;
        System.out.println("\nThe total number of students is " + numberofstudents);


        double numberofYears = 100;
        float snowdays = 8.9F;
        float averageGpa = 4.0F;

        System.out.println("\nNumber of days in a year: " + numberofYears);
        System.out.println("Number of snow days is: " + snowdays);
        System.out.println("Average GPA is: " + averageGpa);

        System.out.println("averageGpa = " + averageGpa);
    }
}
