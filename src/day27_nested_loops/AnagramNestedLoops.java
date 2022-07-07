package day27_nested_loops;

public class AnagramNestedLoops {
    public static void main(String[] args) {
        String a = "hello";
        String b = "goodb";
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            char letter = a.charAt(i);

            for (int j = 0; j <= b.length() - 1; j++) {
                char letter2 = b.charAt(j);

                if (letter == letter2) {
                    count++;
                }
            }
        }

        if (a.length() == b.length()) {
            System.out.println("Anagram");
        } else {
            System.out.println("NOT");
        }

    }
}



