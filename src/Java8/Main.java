package Java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.IntStream;

/**
 * Created by vivek on 24/2/17.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Amit");
        al.add("Vijay");
        al.add("Kumar");
        al.add(1,"Sachin");
        System.out.println("element at 2nd position: "+al.get(2));
        ListIterator<String> itr=al.listIterator();
        System.out.println("traversing elements in forward direction...");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("traversing elements in backward direction...");
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }


    private static boolean isPrime(int number) {
        return number > 1
                && IntStream.range(2, number).noneMatch(
                index -> number % index == 0);
    }


}
