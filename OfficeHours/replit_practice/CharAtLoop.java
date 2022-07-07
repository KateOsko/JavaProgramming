package replit_practice;

import java.util.Scanner;

public class CharAtLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine();

        int count = 0;
        for(int i=0; i<=str.length()-1; i++){
            if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i') ;
            count++;
        }
        System.out.print(""+count);

    }
}