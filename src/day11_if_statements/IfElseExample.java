package day11_if_statements;

public class IfElseExample {
    public static void main(String[] args) {
      /*
      package day11_if_tatements;

public class SingleIfExample {

public static void main(String[]args){


    if(false){
        System.out.println("Hello World");
    }

    System.out.println("Second Line");

    if(true){
        System.out.println("Today is Monday");
    }

    int score = 60;
    if(score>=75){
        System.out.println("Passing");
    }

    if(score<75){
        System.out.println("Failing");
    }

    int year = 2022;
    boolean lockdown = year ==2020 || year ==2021;
    if(lockdown){ //true
        System.out.println("\nStay at home");
        System.out.println("Practice java");
        System.out.println("Wear mask");
    }

    if(!lockdown){ //!false -> true
     System.out.println("\nParty");
        System.out.println("Still practice java");
       System.out.println("Maybe travel");

        //in the situation wherethe lockdown value is true | !true ->false

    }
}
}

       */

        int score = 50;
        if (score >= 75) {
            System.out.println("Passing");
        } else {
            System.out.println("Falling");
        }

        int year = 2022;
        boolean lockdown = year == 2020 || year == 2021;

        if (lockdown) {
            System.out.println("Stay home");
            System.out.println("Practice Java");
            System.out.println("Wear mask");

        } else {
            System.out.println("\nParty");
            System.out.println("Still practice java");
            System.out.println("Maybe travel");

        }
    }
}
