package day09_scanner;

public class TheWeekendsAndProfessional {
    public static void main(String[] args) {

        //Do you get a discount?
        //Mut be a weekend day and must be one of the professionals

         boolean isWeekend = true;
         boolean isTeacher = true;
         boolean isPoliceOffice = false;
         boolean isFireFighter = false;

         boolean getDiscount = isWeekend && (isTeacher || isPoliceOffice || isFireFighter);

        System.out.println(getDiscount);


    }
}
