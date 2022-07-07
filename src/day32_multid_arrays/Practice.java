package day32_multid_arrays;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        String hi = "hello TODAY is the best day!";
        String[] h = hi.split("");
        System.out.println(Arrays.toString(h));

        System.out.println(hi.toCharArray());
        char[] r = hi.toCharArray();
        char[] t = hi.toCharArray();
        System.out.println(r[0]);

        boolean y = r.equals(t);
        System.out.println(y);
        System.out.println(Arrays.toString(r));
        System.out.println(Arrays.toString(t));
        System.out.println(r.equals(t));

        System.out.println(Arrays.binarySearch(h, "T"));

        int[][] cydeo = {{1, 5, 6}, {5, 7, 8}};
        int[][] cydeo1 = new int[4][5];

        System.out.println(Arrays.deepToString(cydeo));
        System.out.println(Arrays.deepToString(cydeo1));

        System.out.println(cydeo[0][1]);

        int[][] l = {{1, 4, 5, 88}, {4, 6, 7}, {4, 78, 20}};
        l[2][0] = 66;
        System.out.println(l[2][0]);
        System.out.println(Arrays.deepToString(l));

        System.out.println(l.length);



        String[] eachWord = {"Helllo", "Morning", "Love"};
        System.out.print(eachWord[0].charAt(0));

    }
}
