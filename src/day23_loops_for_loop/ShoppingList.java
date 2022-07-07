package day23_loops_for_loop;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {


    /* repeated steps:
    ask the user to enter the item
    add item to shopping list
    ask the user if they want to add more itams

    at the end show the full shopping list
     */

        Scanner input = new Scanner(System.in);
        String list = "Shopping List: \n";
        String addMore;

        do {
            System.out.println("Enter the name of the item");
            list += "\n* " + input.nextLine();
            System.out.println("Do you want to add more to your shopping list?");
            addMore = input.nextLine();

        } while (addMore.equalsIgnoreCase("yes"));

        // if the user types anything besides 'yes' the equals
//method will give you false and the loop will stop


        System.out.println(list);

    }
}


