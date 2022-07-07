package day29_arrays_day2;

public class LongestShortest {
    public static void main(String[] args) {
        String [] str = {"apple", "java", "computer", "water"};
        String smallest = str[0];
        String biggest = str[0];

//        for(int i=0; i<str.length; i++){
//            if(str[i].length()>biggest.length()){
//                biggest = str.[i];
//            }
//
//            if(str[i].length()<smallest.length()){
//                smallest = str[i];
//            }
//        }

        for(String bo : str){ // bo is each word
            if (bo.length() > biggest.length()) {
                biggest = bo;
            }

            if (bo.length()< smallest.length()){
                smallest = bo;
            }
        }

        System.out.println("Longest String: " + biggest);
        System.out.println("Smallest String: " + smallest);
    }
}
