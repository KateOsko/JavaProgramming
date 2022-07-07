package day23_loops_for_loop;

public class CountHi {
    public static void main(String[] args) {
        String str = "IcanDoIthiIhihihihcanDoIt";
        int count = 0;

        for (int i = 0; i <str.length()-1; i++) {
            if(str.charAt(i) =='h' && str.charAt(i +1)=='i'){
                count++;
            }

        }
        System.out.println(count);
    }
}
 /*
    String str = "IcanDoIthiIcanDoIt";
    Ic -> an ->Do ->It ->th -> checking two character at a time
  */