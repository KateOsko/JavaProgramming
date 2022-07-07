package day12_multi_branch;

public class Diver {
    public static void main(String[] args) {
        int oxygenLevel = 67;

        if(oxygenLevel>90){
            System.out.println("Your tank if full");
        }else if(oxygenLevel>80){
            System.out.println("Still ok");
        }else if (oxygenLevel>70){
            System.out.println("Don't go too far");
        }else if (oxygenLevel>60){
            System.out.println("Start to head back");
        } else {
            System.out.println("Be careful now you at 50%");
        }

    }
}
