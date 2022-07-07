package day61_collections_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveWhileLooping {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,3,5,6,12,6,35,6,2,5,6,2,3,1,4,5));

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<5){
                list.remove(i);
            }
        }

        System.out.println(list);


        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            if(it.next()<5){
                it.remove();
            }
        }

    }
}
