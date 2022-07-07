public class Swap {
    public static void swappingInts (int a, int b) {
            /*
            swap without the third variable
             */
        a = a + b; // 12
        b = a - b; // 12-2=10
        a = a - b; // 12-10=2
        System.out.println("a:" + a +"\nb:" + b);
    }

    public static void swappingStrings (String str1, String str2) {

        str1=str1+str2; // HelloWorld;
        str2 = str1.substring(0,(str1.length()-str2.length()));
        str1 =  str1.substring(str2.length());
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

    }

        public static void main(String[] args) {
            swappingInts(10,2);
            swappingStrings("Hello", "Polymorphism");

    }
}

