public class EvenOrOdd {
    public static String evenOrOdd (int num){
        if(num%2==0){
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(evenOrOdd(55));
    }
}
