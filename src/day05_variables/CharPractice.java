package day05_variables;

public class CharPractice {
    public static void main(String[] args) {

    char letterOne = 'a';
    char letterTwo = 'Z';
    char numberOne = '9';
    char specialOne = '$';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        System.out.println(letterOne + letterTwo);

       // char letterThree = 65; invalid because it has two characters

        System.out.println(letterOne+letterTwo+numberOne+specialOne);//original:97+93+45+57+36

        char letterThree = 'A';

        System.out.println(letterOne + " " +letterTwo + " "+ letterThree + " " + numberOne + " " +specialOne); //spaces between each char

        System.out.println("char: " + letterOne + letterTwo +letterThree + numberOne + specialOne); //String in the beginning

}
}
