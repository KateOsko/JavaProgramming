package replit_practice;

public class JavaPython {
    public static void main(String[] args) {
        String sentence = "Java not python is not java python";

        int count = 0;
        int count2 = 0;

        for (int i = 0; i < sentence.length() - 1; i++) {

            if (sentence.charAt(i) == 'j' && sentence.charAt(i + 1) == 'a' && sentence.charAt(i + 2) == 'v' && sentence.charAt(i + 3) == 'a'){
                count++;}

                if (sentence.charAt(i) == 'p' && sentence.charAt(i + 1) == 'y' && sentence.charAt(i + 2) == 't' && sentence.charAt(i + 3) == 'h' && sentence.charAt(i + 4) == 'o' && sentence.charAt(i + 5) == 'n'){
                    count2++;
            }
        }

        if (count == count2 && count!=0 && count2!=0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}


