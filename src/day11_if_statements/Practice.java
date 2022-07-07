package day11_if_statements;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a house number");
        int house = s.nextInt();
        System.out.println("Enter a player number");
        int player = s.nextInt();

        //WRITE YOUR CODE BELOW
        if(player>21){
            System.out.println("player bust");
        } else if (player==house){
            System.out.println("it's a tie");
        } else if(player==21){
            System.out.println("player win");

        }else if(player<house){
            System.out.println("player lose");
        } else if (player>house){
            System.out.println("player win");
        }
    }
}