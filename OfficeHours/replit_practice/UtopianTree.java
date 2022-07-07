package replit_practice;

public class UtopianTree {
    public static void main(String[] args) {
        int treeSize = 0;

        for (int i=1; i<=3; i++){
            System.out.println("year " + i + " - grow 1 cm");
            treeSize+=1;
            System.out.println ("tree size: " + treeSize + " cm");
        }

        for (int i=4; i<=10; i++){
            System.out.println("year " + i + " - grow 2 cm");
            treeSize+=2;
            System.out.println ("tree size: " + treeSize + " cm");
        }

    }
}

