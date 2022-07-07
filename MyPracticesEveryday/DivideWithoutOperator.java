public class DivideWithoutOperator {
    public static int divideWithoutOperator(int a, int b){
        int count = 0;
        while(a>0) {
            a -= b;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        System.out.println(divideWithoutOperator(100,5));
    }
}
