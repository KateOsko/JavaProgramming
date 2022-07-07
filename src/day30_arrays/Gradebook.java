package day30_arrays;

import java.util.Scanner;

public class Gradebook {
    public static void main(String[] args) {
        /*
                Gradebook
        Declare three arrays:
        1. String array which will hold names for the students (give values)
        2. Int array which has the score of the student got in the quiz (give values)
        3. Char array which will have some letter grade based on the score (empty)
        4. Output the gradebook at the end with all the information


                Gradebook Example
        Example:
        Names = [“Mike”, “Joe”, “Ana”, “Ali”, “Joanna”]
        Scores = [80, 54, 100, 66, 94]
        Grades= [‘B’, ‘D’, ‘A’, ‘C’, ‘A’] -> Need to find and store these based on score

                Output:
        Mike | 80 | B
        Joe | 54 | D
        Ana | 100 | A
        Ali | 66 | C
        Joanna | 94 | A

        Grade scale:
        Above 85: A
        Above 75: B
        Above 65: C
        Other: D
         */

        String[] names = {"Mike", "Joe", "Ana", "Ali", "Joanna"};
        int[] scores = {80, 54, 100, 66, 94};
        char[] letterGrade = new char[5];

       // String [] questions = {"Whats your name", " Your score", "Your grade"};

        //Scanner input = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 85) {
                letterGrade[i] = 'A';
                System.out.println(names[i] + " | " + scores[i] + " | " + letterGrade[i]);

            } else if (scores[i] >= 75) {
                letterGrade[i] = 'B';
                System.out.println(names[i] + " | " + scores[i] + " | " + letterGrade[i]);

            }else if (scores[i]>=65) {
                        letterGrade[i] = 'C';
                        System.out.println(names[i] + " | " + scores[i] + " | " + letterGrade[i]);
            } else if (scores[i] <65){
                letterGrade[i] = 'D';
                System.out.println(names[i] + " | " + scores[i] + " | " + letterGrade[i]);

            }
            }

        }
    }

