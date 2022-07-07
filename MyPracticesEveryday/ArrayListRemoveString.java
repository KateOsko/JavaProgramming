import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveString {
    /*
            ArrayList - Remove "Ahmed"
            Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
            Write a java operation to remove all the names named Ahmed
     */
    public static ArrayList<String> removeString (ArrayList<String> arr){
    ArrayList<String> newarr = new ArrayList<>();
        arr.removeIf(n -> n.equals("Ahmed"));

        for (String i : arr) {
        newarr.add(i);
    }
        return newarr;
}

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println(removeString(arr));
    }
}
