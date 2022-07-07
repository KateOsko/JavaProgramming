package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    /*
    make an array of your friends names
    asking how many friends do you have

    then ask for each friend's name one at a time, store all the names into an array

    print your friends list
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many friends do you want to store?");
        int size = input.nextInt();
        String [] friendlist = new String[size];

        for (int i=0; i<friendlist.length; i++){
            System.out.println("Enter friend name"+(i+" "+ 1));
            friendlist[i]=input.next();
        }

        System.out.println(Arrays.toString(friendlist));



    }
}
