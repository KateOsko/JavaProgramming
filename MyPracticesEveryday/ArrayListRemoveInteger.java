import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveInteger {
    public static ArrayList<Integer> remove100 (ArrayList<Integer> Numbers){

        ArrayList<Integer> newarr = new ArrayList<>();
        Numbers.removeIf(n -> (n>100 ));

        for (int i : Numbers) {
            newarr.add(i);
        }
        return newarr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> Numbers = new ArrayList(Arrays.asList(1,2,3,4,34,22,90,120,340,5,650,3000,150,5,6));
        System.out.println(remove100(Numbers));

    }
}


