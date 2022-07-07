package day09_scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        /*
        create and assign these variables:
        name
        are they citizens
        do they have criminal background
        age

        determine if they are eligible to vote
        they can only vote if they are citizens
        have no criminal background

         */

       String name = "Alex";
       boolean citizen = true;
       boolean criminalBackground = false;
       int age = 34;

       boolean isEligibleToVote = age>=18 && citizen && !false;
       System.out.println(name+ " is eligible to vote: " + isEligibleToVote);




    }
}
