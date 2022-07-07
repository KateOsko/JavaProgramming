package day19_string;

public class SubstringMethod {
    public static void main(String[] args) {
        String str="sunday";
        //          012345
        System.out.println(str.substring(1));
        System.out.println(str.substring(3));
        System.out.println(str);
        System.out.println("satur" + str.substring(3));

        System.out.println(str.substring(2,4)); //without 4
        System.out.println(str.substring(2,5)); //without 5
        System.out.println(str.substring(2,6));// 6 there is 6 character therefore it will print "nday" inted 6 is a stopping point

      //  System.out.println(str.substring(2,7)); gived error. there is
    }
}
