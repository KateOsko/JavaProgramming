package day24_loops_for_loop_practice;

public class CountJava {
    public static void main(String[] args) {
        //java is a language
       // 0123

        //java 0,4
        // ava 1,5

        String str = "java is a java language.java";
        int count = 0;

        for (int i = 0; i<str.length()-3; i++){ // i<=str.length()-4;
            String everyForLetters = str.substring(i, i+4);
            if (everyForLetters.equals("java")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
