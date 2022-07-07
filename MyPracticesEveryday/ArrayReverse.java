import java.util.ArrayList;
import java.util.Arrays;

public class ArrayReverse {
    public static ArrayList<String> arrayReverse(String[] a) {

        ArrayList<String> b = new ArrayList<>(a.length);
        for (int i = a.length - 1; i > 0; i--) {
            b.add(a[i]);
        }
        b.add(a[0]);
        return b;
    }

    public static void main(String[] args) {
        String[] a = {"hello", "goodbye", "hi", "bye", "why"};
        System.out.println(arrayReverse(a));
    }
}

