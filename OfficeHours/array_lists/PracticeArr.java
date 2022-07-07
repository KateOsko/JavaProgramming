package array_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PracticeArr {
    public static void main(String[] args) {
        //ArrayList methods:

        ArrayList<Integer> num = new ArrayList <> (Arrays.asList(1,2,3,4,5,6,7, 7 ,8, 8));

        //add(Object):  adds the elements to the indexes of the arraylist
        num.add(100);
        System.out.println(num); // [1, 2, 2, 3, 4, 5, 6, 7, 7, 8, 8, 100]

        // add(index, Object): adds the element to the given index (index must be exist)
        num.add(1,100);
        System.out.println(num ); //[1, 100, 2, 3, 4, 5, 6, 7, 7, 8, 8, 100]

        // get(index): returns the element at given index
        System.out.println(num.get(1)); //100

        // set(index, Object): replaces the old element at given index with new element
        num.set(num.size()-1,250);
        System.out.println(num); //[1, 100, 2, 3, 4, 5, 6, 7, 7, 8, 8, 250]

        // indexOf(Object): returns the first matching object' index number
        System.out.println(num.indexOf(250)); //11

        // size(): returns the total number of elements
        System.out.println(num.size()); //12

        // remove(index): removes the object at the given index
        num.remove(11);
        System.out.println(num); //[1, 100, 2, 3, 4, 5, 6, 7, 7, 8, 8]

        // remove(object): removes the first matching object

       num.remove(Integer.valueOf(100));
        System.out.println(num); //[1, 2, 3, 4, 5, 6, 7, 7, 8, 8]


        //bulk method we use --> Arrays.asList
        // removeAll() : to remove multiple elements
        //num.removeAll(num);
        //System.out.println(num); []

        // retainAll() : to retain multiple elements
        num.retainAll(Arrays.asList(8)); // bulk methods
        System.out.println(num);


   				   // removeIf()  : removes element according to condition

   				   // containsAll(): checks if all elemnts are contained in the list

   				   // addAll()  :  adds collection of elements to the list

				   // clear(): removes all the objects from the List

				   // isEmpty(): returns true if the list contains no element

			//Collections Methods

			       // sort()    : sort the given collection
			       // reverse() : reverse the order of the elements in given collection
			       // max()     : returns the biggest element
			       // min()     : returns the smallest element
			       // swap()    : swap the elements in the collection with their indexes
			       // frequency(c,o):
			       //         c – the collection in which to determine the frequency of o
                    //        o – the object whose frequency is to be determined


        /*Small Tasks (ArrayList)

            1. write a program that can set the last element of the Integer arraylist to zero
                        ex:
                            list = [1,2,3,4,5];
                            output: [1,2,3,4,0];

            2. write a program that can swap the first and last elements of an ArrayList

            3. write a program that can multiply each odd number by 2
                        ex: list = [1,2,3,4,5];
                            output: [2,2,6,4,10]

            4. write a program that can combine two String arrays into one arrayList
                        ex:
                            arr1 = {"A", "B", "C"};
                            arr2 = {"D", "E", "F", "G"};
                            list ==> {"A", "B", "C", "D", "E", "F", "G"}

           Task 2 : write a program that can return the nth largest number from an arraylist

                    			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
                    			n = 5

                    			output:
                    				4

           Task 3 : write a program that can find the frequency of character from a String
                                    DO NOT use nested loop

                                    "AABBCCDDEE"  ==> "ABCDE"
                                    output: A2B2C2D2E2

           IQ --> Task 4 :

           /*
               We consider a number to be lovely if it contains fewer than
               three instances of any distinct digit (in decimal representation).

                    Examples of lovely numbers: 0, 100, 1232 and 9922;
                    Examples of numbers that are not lovely:
                               1000 (contains three copies of digit '0'),
                               33533 (contains four copies of digit '3').

                       Examples:
                       lovelyNumber(0)    ---returns 1
                       lovelyNumber(100)  ---returns 1
                       lovelyNumber(111)  ---returns 0
                       lovelyNumber(1232) ---returns 1
                       lovelyNumber(9922) ---returns 1
                       lovelyNumber(99922)---returns 0

                       In your solution, focus on correctness. The performance of your
                       solution will not be the focus of the assessment.

               */
    }
}
