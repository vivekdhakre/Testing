package collection;

import java.util.ArrayList;

/**
 * Created by vivek on 7/2/17.
 */
public class ListIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        list.forEach(l -> System.out.println(l));

//        // ListIterator to traverse the list
//        java.util.ListIterator iterator = list.listIterator();
//
//        // Traversing the list in forward direction
//        System.out.println("Displaying list elements in forward direction : ");
//
//        while (iterator.hasNext())
//            System.out.print(iterator.next()+ " ");
////
////        System.out.println();
//
//        // Traversing the list in backward direction
//        System.out.println("Displaying list elements in backward direction : ");
//
//        while(iterator.hasPrevious())
//            System.out.print(iterator.previous()+ " ");
//
//        System.out.println();
    }
}
