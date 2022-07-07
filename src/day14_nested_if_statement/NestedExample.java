package day14_nested_if_statement;

public class NestedExample {

    public static void main(String[] args) {
        boolean a=false;
        boolean b=false;
        boolean c=false;

        if(a) {
            System.out.println("1");

            if(b){
                System.out.println("2");//if a=true we get 1
            }
            if(c) {
                System.out.println(3);
            } else {
                System.out.println(4);
            }
        } else{
            System.out.println("z"); //if
        }
    }
}
