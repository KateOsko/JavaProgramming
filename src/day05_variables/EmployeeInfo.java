package day05_variables;

public class EmployeeInfo {
    public static void main(String[] args) {

        String firstname = "Ekaterina";
        String lastName = "Ostapenko";
        char gender = 'F';
        int age = 31;
        String companyName = "Creative 100K company";
        boolean fulltime = true;
        String jobTitle = "Creative Director";
        double salary = 1_000_000;
        int pto = 25;
        boolean married = true;
        char suitechar = 'A';


        String fullSentence = "First Name is: " + firstname + "\nLast nae is: " + lastName + "\nGender: " + gender + "\nAge: " + age + "\nCompany name: " + companyName + "\nFull Time: " + fulltime + "\nJob Title" + jobTitle + "\nSalary is: " + salary + "\nThe number of PTO: " + pto + "\nMarried: " + married + "\nThe suite is: " + suitechar;

        System.out.println(fullSentence);
    }
}
