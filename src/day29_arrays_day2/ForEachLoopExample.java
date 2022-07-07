package day29_arrays_day2;

public class ForEachLoopExample {
    public static void main(String[] args) {
        int[] nums = {30, 12, 159, 12};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("traditional " + nums[i]);
        }
        System.out.println();

        for(int element : nums){
            System.out.println("for each: " + element);



            String[]classes = {"java", "soft skills", "selenium", "database", "htms"};
            //traditional
            for(int i = 0; i<classes.length; i++){
                System.out.println(classes[i]);
            }
            System.out.println();

            //for each
            for(String word: classes){
                System.out.println(word);}
        }
    }
}
