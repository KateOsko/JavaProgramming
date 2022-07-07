public class FrequencyOfCharacter {
    public static String frequencyOfChar(String str) {

        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            if(newStr.contains(str.charAt(i) + "")){
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
            }
            }

            newStr+= "" + str.charAt(i) + count;

        }

        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChar("HellloWooorld"));
    }
}
