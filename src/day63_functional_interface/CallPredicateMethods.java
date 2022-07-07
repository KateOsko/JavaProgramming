package day63_functional_interface;

public class CallPredicateMethods {
    public static void main(String[] args) {

        boolean a = UsePredicate.isPalindrome.test("anna");// defined in the actual method Predicate
        System.out.println(a);
        boolean d = UsePredicate.isPalindrome.test("HelloWorld");
        System.out.println(d);


        System.out.println(UsePredicate.isPrime.test(10));

    }
}
