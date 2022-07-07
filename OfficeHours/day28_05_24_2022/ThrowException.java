package day28_05_24_2022;

public class ThrowException {
    public static void main(String[] args) {

        String str = "";
        if(str.isEmpty()){

            System.out.println("Name can notbe empty");
            System.out.println("Name can notbe empty");

            throw new RuntimeException("Name can notbe empty");
        }

    }
}
