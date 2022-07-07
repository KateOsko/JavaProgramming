package day13_if_statement;

public class IfStatementWithWithoutBrackets {

    public static void main(String[] args) {
        //with brackets
        if (5 > 3)
            System.out.println("hello");

        //without brackets:
        if (9 < 10)
            System.out.println("hello");
            System.out.println("other line"); //this will not relate to the IF statement

        //printing without brackets will only relate to the line behind it


        if(3%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }}
