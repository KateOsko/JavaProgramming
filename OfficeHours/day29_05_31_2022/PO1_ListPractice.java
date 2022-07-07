package day29_05_31_2022;

import java.util.*;

public class PO1_ListPractice {
    public static void main(String[] args) {

        System.out.println();
        Integer[] nums = {1, 2, 3, 4, 5, 4, 3, 2, 1};

        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(nums));
        System.out.println(arrList);
        System.out.println(arrList.get(0));
        System.out.println(arrList.size());


        System.out.println();

        System.out.println("LinkedList");
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(nums));
        System.out.println(linkedList);
        linkedList.addFirst(0);
        linkedList.addLast(100);
        System.out.println(linkedList);

        System.out.println("Vector");
        Vector<Integer> vectorList = new Vector<>(Arrays.asList(nums));
        System.out.println(vectorList.get(0));
        System.out.println(vectorList.size());

        System.out.println();
        System.out.println("Stack");

        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(nums));
        System.out.println(stack);
        stack.push(10);

        Integer a = stack.pop(); // remove last element and return it
        System.out.println(a);
        stack.push(12); // adding

        System.out.println(stack.peek()); // peek looking the last one/ returning
        stack.pop(); // removing last
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);


//        Integer a = stack.pop();
//        System.out.println(a);





       // System.out.println(stack);

        System.out.println();

        Map<String,String> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3,1,4,7,2,3,4,5,1));
        Set<Integer> set = new LinkedHashSet<>();

        for(Integer num: list){
            set.add(num);
            if(num==7){
                set.add(null);
            }
        }

        System.out.println(set);

    }
}