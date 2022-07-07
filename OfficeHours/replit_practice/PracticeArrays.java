package replit_practice;

public class PracticeArrays {
    public static void main(String[] args) {
        String[] arr = {"beauty", "love", "world", "healing"};
        for (String each:arr){
            String initials = each.substring(0,1) + each.charAt(each.length()-1);

            System.out.println(initials);}
    }
}
