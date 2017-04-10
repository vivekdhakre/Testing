package collection;

import java.util.*;
import java.util.ListIterator;

/**
 * Created by vivek on 7/2/17.
 */
public class Test {

    public static void main(String[] args) {

//        Enumeration

//        Vector v = new Vector();
//        for (int i = 0; i < 10; i++)
//            v.addElement(i);
//        System.out.println(v);
//
//        // At beginning e(cursor) will point to
//        // index just before the first element in v
//        Enumeration e = v.elements();
//
//        // Checking the next element availability
//        while (e.hasMoreElements())
//        {
//            System.out.println("===========================");
//            // moving cursor to next element
//            int i = (Integer)e.nextElement();
//
//            System.out.print(i + " ");
//            i = (Integer)e.nextElement();
//
//            System.out.print(i + " ");
//        }

//        Iterator

//        ArrayList al = new ArrayList();
//
//        for (int i = 0; i < 10; i++)
//            al.add(i);
//
//        System.out.println(al);
//
//        // at beginning itr(cursor) will point to
//        // index just before the first element in al
//        Iterator itr = al.iterator();
//
//        // checking the next element availabilty
//        while (itr.hasNext())
//        {
//            //  moving cursor to next element
//            int i = (Integer)itr.next();
//
//            // getting even elements one by one
//            System.out.print(i + " ");
//
//            // Removing odd elements
//            if (i % 2 != 0) {
//                itr.remove();
//            }
//        }
//        System.out.println();
//        System.out.println(al);

//        ListIterator

        ArrayList al = new ArrayList();
        for (int i = 0; i < 10; i++)
            al.add(i);

        System.out.println(al);

        // at beginning ltr(cursor) will point to
        // index just before the first element in al
        ListIterator ltr = al.listIterator();

        // checking the next element availabilty
        while (ltr.hasNext())
        {
            //  moving cursor to next element
            int i = (Integer)ltr.next();

            // getting even elements one by one
            System.out.print(i + " ");

            // Changing even numbers to odd and
            // adding modified number again in
            // iterator
            if (i%2==0)
            {
                i++;  // Change to odd
                ltr.set(i);  // set method to change value
                ltr.add(100);  // to add
            }
        }
        System.out.println();
        System.out.println(al);
    }
}
