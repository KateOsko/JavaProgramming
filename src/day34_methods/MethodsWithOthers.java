package day34_methods;

public class MethodsWithOthers {
    public static String dayInWords(int day) {

        switch (day) {
            case 1:
                return "Monday"; // no break and no assigning to a variable

            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";

            case 4:
                return "Thursday";
            case 5:
                return "Friday";

            case 6:
                return "Saturday";

            case 7:
                return "Sunday";
            default:
                return "Invalid";
        }

    }

    public static int firstEvenNumber(int[] nums) {
        for (int num : nums) {
            if (num % 2 == 0){
                return num;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int [] arr = {4,1,5,12,5};
        System.out.println(firstEvenNumber(arr));
    }
}
