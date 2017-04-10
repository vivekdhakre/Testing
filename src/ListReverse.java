import java.util.*;

/**
 * Created by vivek on 20/12/16.
 */
public class ListReverse {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","s","d","f","g","h","j","k","l");
        System.out.println(list);

//        Collections.reverse(list);
//        System.out.println(list);

//        ListIterator<String> listIterator= list.listIterator(list.size());
//
//        while(listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }
        int size = list.size();
        if (size < 18 || list instanceof RandomAccess) {
            for (int i=0, mid=size>>1, j=size-1; i<mid; i++, j--){
                swap(list, i, j);
                System.out.println("list: "+list+" | "+mid);
                //break;
            }

        } else {
            // instead of using a raw type here, it's possible to capture
            // the wildcard but it will require a call to a supplementary
            // private method
            ListIterator fwd = list.listIterator();
            ListIterator rev = list.listIterator(size);
            for (int i=0, mid=list.size()>>1; i<mid; i++) {
                Object tmp = fwd.next();
                fwd.set(rev.previous());
                rev.set(tmp);
            }
        }

    }
    public static void swap(List<?> list, int i, int j) {
        // instead of using a raw type here, it's possible to capture
        // the wildcard but it will require a call to a supplementary
        // private method
        System.out.println(list+" | "+i+" | "+j);
        final List l = list;
        l.set(i, l.set(j, l.get(i)));
    }
}
