package day11_if_statements;

public class UpperOrLowerCase {
    public static void main(String[] args) {
        /*
        create a char variable with a letter (can only do this one hardcoded, no Scanner method for char)
find out if the letter is an uppercase letter or lowercase letter. Print the type of letter it is

	ex:
		'b'
		lowercase

	ex:
		'U'
		uppercase
         */
        char letter = 'Z';

        if(letter>=97 && letter<=122) {
            System.out.println(letter);
            System.out.println("lowercase");}
        if(letter>=65 && letter<=90) {
            System.out.println(letter);
            System.out.println("Uppercase");

        }

    }
}
