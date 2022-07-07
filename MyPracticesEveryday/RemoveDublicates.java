public class RemoveDublicates {

    public static String removeDublicates(String str) {
        String removeDublicates = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                continue;
            } else {
                removeDublicates += str.charAt(i);
            }
        }

        for (int i = 0; i < str.length(); i++)
            if (str.charAt(str.length() - 1) != removeDublicates.charAt(removeDublicates.length() - 1)) {
                removeDublicates += str.charAt(str.length() - 1);
            }
        return removeDublicates;
    }


    public static void main(String[] args) {
        String str = "aaabbrrrrjsss";

        System.out.println(removeDublicates(str));
    }

}

