package day08_relational_operators;

public class LastPractive {
    public static void main(String[] args) {
        int a = 20; //2- ->19 ->20 ->19 ->18
        int b = -a-- +a++ + --a * a--;
        //-20 +19+19*19
        //-20+19+361
        //-1 +361
        //360

    }
}
