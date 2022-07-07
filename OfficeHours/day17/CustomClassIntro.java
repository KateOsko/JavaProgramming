package day17;

public class CustomClassIntro {

    String instanceVariable; // null default
    /*
        - should be in class but OUTSIDE of any method
        - Initialization isn't mandatory


        how can we access them?

     */

        public CustomClassIntro(){
            System.out.println("Const is running");
            instanceVariable = "Hello from Const";
        }

        public void instanceMethod(){


        }






}
