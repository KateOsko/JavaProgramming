public class BiggestString {
    /*
    Biggest substring of matching characters
    Biggest substring of chars
    Ex: "aaabbbcccccddddee"
     */

    public static void main(String[] args) {
        String str = "aaaabbcccccccddeeee";

        String str2 = "";
        String longest = "";

        for (int i = 0; i < str.length()-1; i++) {
            str2+=str.charAt(i);

            if(str.charAt(i) != str.charAt(i+1)){
                if(str2.length() > longest.length()){
                    longest=str2;
                }
                str2=""; // resets the String
            }
        }

        System.out.println(longest);

        }
    }














//    public static void main(String[] args) {
//
//    String s = "aaabbbcccccddddee";
//    String sub = ""; //aaa
//    String longest = ""; //aaa
//
//        for (int i = 0; i < s.length()-1; i++) {
//            sub += s.charAt(i);
//
//            if(s.charAt(i) != s.charAt(i+1)){
//                if(sub.length()>longest.length()){
//                    longest = sub;
//                }
//                sub=""; // reset this String for the next substring
//            }
//        }
//        System.out.println(longest);
//
//}
//}
