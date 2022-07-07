import java.util.Scanner;

public class CamelCase {
    /*
    make the String camelCase all words are together
    every word starts with the Capital letter
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine().toLowerCase();
        //String str = Today Is SUNDAY

        String camelC = str.substring(0,1);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                camelC+=(str.charAt(i+1)+"").toUpperCase();
            } else  if (str.charAt(i-1) == ' '){
                continue;
            } else {
                camelC += str.charAt(i);
            }

        }
        System.out.println(camelC);
    }
}


//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a phrase"); // Hello Words
//        String str = input.nextLine().toLowerCase();
//
//        String camelC = "";
//
//        for (int i = 1; i < str.length(); i++) {
//            if (str.charAt(i) == ' ') {
//                camelC += (str.substring(i + 1, i + 2).toUpperCase());
//            } else if (str.charAt(i-1) == ' ') {
//                continue;
//
//            }else {
//                camelC += str.charAt(i);
//            }
//
//        }
//        System.out.println(str.substring(0,1).toLowerCase()+ camelC);
//
//            }
//
//
//        }
//
//
