
public class FINRA {
    public static String finRa(int num) {
        String abc = "";
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                abc += "FINRA  ";

            } else if (i % 3 == 0) {
                abc += "FIN ";

            } else if (i % 5 == 0) {
                abc += "RA ";

            } else {
                abc += i + " ";
            }
        }
        return(abc);
    }

        public static void main (String[]args){
            System.out.println(finRa(30));
        }
}

