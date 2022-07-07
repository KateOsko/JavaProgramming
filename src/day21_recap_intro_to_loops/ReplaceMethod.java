package day21_recap_intro_to_loops;

public class ReplaceMethod {
    public static void main(String[] args) {
        String s = "java is a language";
        s = s.replace('a', 'e');
        System.out.println(s);

        String day = "Today is monday. It's monday. I love monday";


        day = day.replace("monday","tuesday");
        System.out.println(day);
    }
}
