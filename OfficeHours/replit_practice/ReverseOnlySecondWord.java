package replit_practice;

public class ReverseOnlySecondWord {

            public static void main(String[] args) {

                String s = "I love java";
                //          0123

                String reverseWord = "";

                int startIndex = s.indexOf(" ");
                int lastIndex = s.lastIndexOf(" ");

                String secondWord =  s.substring(startIndex + 1, lastIndex ) ;
                System.out.println(secondWord);

                // for ( int i = 0 ; i < s.length() ; i++)
                for (int i = secondWord.length() ; i >= 0 ; i--) {

                    reverseWord +=  secondWord.charAt(i);

                    // reverseWord = reverseWord + secondWord.charAt(i);
                }

                s = s.replace(secondWord, reverseWord);
                System.out.println( s );
    }
}
