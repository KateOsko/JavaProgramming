package replit_practice;

public class RecapString {
    public static void main(String[] args) {
        // equals()
        String a = "UNIVERSE is vast";
        String b = "Universe is   vast";
        System.out.println(a.equals(b));

        //equalsIgnoreCase()
        boolean e = true;
        String c = "banana";
        System.out.println(b.equalsIgnoreCase(c));

        // length
        System.out.println(a.length() + a.substring(a.length() - 1));

        //toUppperCase,LowerCase
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());

        //endsWith
        boolean y = a.endsWith("vast");
        String b2 = b.substring(0, 8);
        boolean o = a.startsWith("Universe");
        System.out.println(b2);
        boolean g = b.equals(a.startsWith("Universe is   vast")); //String b = "Universe is   vast";
        System.out.println(g);

        //contains
        String a2 = "It's raining ";
        System.out.println(a2.contains("i"));
        boolean y6 = a2.contains("ra");
        System.out.println(y6 + "----------------");

        //isEmpty
        String a3 = " ";
        System.out.println(a3.isEmpty()); // should have nothing

        //isBlank
        System.out.println(a3.isBlank()); //can have white spaces

        //trim
        System.out.println(a2.trim());

        //charAt()   string--> chartAt index ---> char
        System.out.println(a2.charAt(2));

        //substring
        String f = "funny";
        System.out.println(f.substring(0,3));
        System.out.println(f.substring(3));

        //indexOf()
        //(char)
        //String
        //char/String, int

        String h = "house in house the house";
        int d = h.indexOf("house");
        System.out.println(d);

        //lastIndexOf()
        System.out.println(h.indexOf("house"));

        //replace
        String j = "Life is good, the sun is shining";
        String j2 = j.replace("good", "great");
        System.out.println(j2);
        String j3 = j.replace('o','u');
        System.out.println(j3);

        //replaceFirst
        System.out.println(j.replaceFirst("i","kuku"));



    }
}
