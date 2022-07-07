package day26_nested_loops;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        // how many times does the letter appear in the string

        String a = "Aapppleee";
        String checked = "";

        for (int i = 0; i < a.length(); i++) {
            int count = 0; // everytime the outer loop iterates, the counter is set back to 0. It's is reset between every character
            char letter = a.charAt(i);

            if(checked.contains(a.charAt(i) + "")){
                continue;
            } // we are checking only the outer loop and repeating letter in the word itself. there is no need to continue checking to repeating character since it's already counted all of the characters in the inner loop. So we continue (skipping the inner loop)

            for (int j = 0; j < a.length(); j++) {
                char eachLetter = a.charAt(j);

                if (letter == eachLetter) {
                    count++;
                }
            }
            System.out.println(a.charAt(i) + "-" + count);
            checked += letter; //Aap

        }
    }
}
