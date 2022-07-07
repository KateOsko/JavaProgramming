import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterable {

    /*
    allows the object to be Iterated by using Iterator

     For i loop
     For each loop
     but if it's extends Iterable interface than we can use Iterator

     * hasNext()
     * next
     * remove()

      */
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 55, 6, 7, 7, 89, 999, 0, 9, 7, 44, 3, 5, 6, 1, 2));

        for(int i=0; i<list.size(); i++){

            if(list.get(i)<10){
                list.remove(i);
            }
        }
        System.out.println(list);


        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            Integer element = it.next();

            if(element<10){
                it.remove();
            }
        }
        System.out.println(list);



        List <Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,5,2,4,1,89,4,90,2,1,5,8,5,1,2));

        Iterator <Integer> it3 = list3.iterator();
        while(it3.hasNext()) {
            if (it3.next() > 10) {
                it3.remove();
            }
        }
            System.out.println(list3);


//        list3.removeIf(p->p>10);
//        System.out.println(list3);


    }
}