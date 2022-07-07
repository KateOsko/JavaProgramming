package day11_if_statements;
import java.util.Scanner;
public class SalesAmount {

    /*
    use the sales amount to determine the bonus you get at end of the month

	if your sales amount is less than 10000 you don't get any bonus

	if your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000

	if your sales amount is more than or equal to 15000 you get a bonus of 7000

	print your bonus number
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("What's your sales amount this month?");

        double sales = input.nextDouble();

        if(sales<10000){
            System.out.println("You don't get any bonuses");
            System.out.println("Your total pay is $"+sales);}

        if(sales>=10000 && sales<15000){
            System.out.println("You get a bonus of $5000! Yeah!");}

        if(sales>=15000){
            System.out.println("You get a bonus of $7000");
            sales +=7000;
            System.out.println("You get paid: $" + sales);}

}
}