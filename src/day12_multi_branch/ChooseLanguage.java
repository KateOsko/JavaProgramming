package day12_multi_branch;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        /*
        create a class ChooseLanguage
ask the user to enter a number based on the language they wanted to use.
	1 - English
	2 - Spanish
	3 - Turkish
	4 - Russian
	5 - French

based on the number they picked print a message:

	1 : "hello, thank for your call"
    2 : "hola, gracias para llamar"
    3 : "merhaba, aradiginiz icin tesekkurler"
    4 : "privet, spasibo za vash zvonok"
    5 : "Merci ,pour votre appel"
    any other number: "We will use English by default"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter language: \n\t1-English\n\t2-Spanish\n\t3-Turkish\n\t4-Russian\n\t5-French");
        int languageN = input.nextInt();
        String message;

        if (languageN == 1) {
            message="You picked English.\nHello, thank for your call";
        } else if (languageN == 2) {
            message = "You picked Spanish.\nHola, gracias para llamar";
        } else if (languageN == 3) {
            message ="You picked Turkish.\nmerhaba, aradiginiz icin tesekkurle";
        } else if (languageN == 4) {
            message = "You picked Russian.\nPrivet, spasibo za vash zvonok";
        } else if (languageN == 5) {
            message = "You picked French.\nMerci ,pour votre appel";
        } else {
            message= "We will use English by default";
        }
        System.out.println(message);
    }
}
