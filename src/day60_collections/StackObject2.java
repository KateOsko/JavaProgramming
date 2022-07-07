package day60_collections;

import java.util.Stack;

public class StackObject2 {

    public static void main(String[] args) {

        Stack <Integer> stack = new Stack<>();
        stack.add(40);
        stack.add(20);
        stack.add(100);
        stack.push(30); // adds element at the top of the stack
        /*
        methods for LIFO:

        push(): add the element to the top of the stack
        peek(): return the element at the top of the stack. does not remove it, only lets you see what there
        pop(): remove the element at the top of the stack, and returns it

         */
        System.out.println(stack);
        System.out.println(stack.peek()); //40

        System.out.println(stack.pop());

        System.out.println(stack.pop());
        System.out.println(stack);

    }
}
