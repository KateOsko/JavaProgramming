public class PasswordValidationTask {
    /*
                Write a return method that can verify if a password is valid or not. Requirements:
            1. Password MUST be at least 6 characters and should not contain space
            2. Password should at least contain one upper case letter
            3. Password should at least contain one lowercase letter
            4. Password should at least contain one special characters
            5. Password should at least contain a digit
            6. if all requirements above are met, the method returns true, otherwise returns false
     */

    public static boolean passwordValid(String password) {
        boolean pass;
        int lower=0;
        int upper=0;
        int digits=0;
        int specialChar = 0;


        //isBlank() --> no white spaces;  isEmpty() --> no characters. length==0
        if (password.length() >= 6 && !password.contains(" ")) {
            char a;

            for (int i = 0; i < password.length(); i++) {
                a = password.charAt(i);
                if (Character.isLowerCase(a) ) {
                    lower ++;
                }
                if (Character.isUpperCase(a)) {
                    upper++;
                }
                if (Character.isDigit(a)) {
                    digits++;
                }
                if (!Character.isDigit(a)
                        && !Character.isLetter(a)
                        && !Character.isWhitespace(a)) {
                    specialChar++;
                }
            }

            // When there is no special character encountered
            if (lower>=1 && upper>=1 && digits>=1 && specialChar>=1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(passwordValid("Hello Workd7778$"));
    }
}

