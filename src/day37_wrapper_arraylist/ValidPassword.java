package day37_wrapper_arraylist;

public class ValidPassword {
    public static void main(String[] args) {
        /*
        Valid Password
	    Given a String password find out if it is a valid password

	Requirements:
		Must have at least 8 characters
		Must have at least 1 uppercase letter
		Must have at least 1 lowercase letter
		Must have at least 1 number
		Must have one of the follow special characters:
			! @ # $ % ^ & *
         */

        String pass = "hTygr5*";
        char letter = ' ';

        boolean t = letter == '!' || letter=='@'|| letter=='#' || letter =='$' || letter == '%' || letter =='^' || letter == '&' || letter == '*';


        for( int i = 0; i<pass.length(); i++){
           letter = pass.charAt(i);}

        if (Character.isUpperCase(letter) && Character.isDigit(letter) && Character.isLowerCase(letter) && pass.length()==8 & t==true){


                System.out.println("Valid Password");}
            else {
                System.out.println("Invalid Password");
            }

        }
    }

