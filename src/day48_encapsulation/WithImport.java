package day48_encapsulation;

import my_utilities.StringUtil;

import java.util.Arrays;
import static java.util.Arrays.*;

public class WithImport {
    public static void main(String[] args) {
        int [] a = { 4, 12, 5, 25};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println(Math.E);
        System.out.println(StringUtil.reverse("java"));
    }
}
