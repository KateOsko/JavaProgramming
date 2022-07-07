package day28_05_24_2022;

public class FinallyBlock {
    public static void main(String[] args) {


        readFromDB();
        System.out.println();

    }

    private static void readFromDB() {

        Connection connection = new Connection();
        try {
            connection.open();

            //Read data from database
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointer Exceptions is handled");
        } finally {

            connection.close();
        }


    }
}