package day07_unary_operators;

public class Letters {
    public static void main(String[] args) {
        // Task: define a character. print me the next four characters on new lines

        char a = 'A';
        System.out.println(a++);

        char b = a++;
        System.out.println(b++);

        char c = b++;
        System.out.println(c++);

        char d = c++;
        System.out.println(d++);

        char e = d++;
        System.out.println(e++);

    }
}
