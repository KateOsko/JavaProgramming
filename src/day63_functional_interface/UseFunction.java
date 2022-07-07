package day63_functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class UseFunction {
    public static void main(String[] args) {

        //<T, R> two generic T-argument, R-return type
        Function <int [], List<Integer>>  convertArrayToList = (nums) -> {
            //object as Array, ArrayList as an return type
            List <Integer> list = new ArrayList<>();
            for(int each : nums) {
                list.add(each);
            }
            return list;
        };

        int [] a = {32,5,12,5};
        List<Integer> list = convertArrayToList.apply(a);
        System.out.println(list);

    }
}
