import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Vivek on 18/7/17.
 * @project Test18July
 * @package PACKAGE_NAME
 */
public class Test18July {

    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet(new MyComparator());
//        treeSet.add(10);
//        treeSet.add(2);
//        treeSet.add(5);
//        treeSet.add(4);
//        treeSet.add(24);
//        treeSet.add(15);
//        treeSet.add(25);

//        treeSet.add("Vivek");
//        treeSet.add("Dhakre");
//        treeSet.add("Nikhil");
//        treeSet.add("Jawariya");
//        treeSet.add("Chandan");
//        treeSet.add("Likhar");
//        treeSet.add("Atul");
//        treeSet.add("Kumar");
//        treeSet.add("Singh");

        treeSet.add(new StringBuffer("Vivek"));
        treeSet.add(new StringBuffer("Dhakre"));
        treeSet.add(new StringBuffer("Nikhil"));
        treeSet.add(new StringBuffer("Jawariya"));
        treeSet.add(new StringBuffer("Chandan"));
        treeSet.add(new StringBuffer("Likhar"));
        treeSet.add(new StringBuffer("Atul"));
        treeSet.add(new StringBuffer("Kumar"));
        treeSet.add(new StringBuffer("Singh"));

        System.out.println(treeSet);
    }
}

class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Integer) {
            Integer i1 = (Integer) o1;
            Integer i2 = (Integer) o2;

//            if(i1<i2) return +1;
//            else if(i1>i2) return -1;
//            else return 0;
            return -i2.compareTo(i1);
        } else if (o1 instanceof String && o2 instanceof String) {
            String s1 = (String) o1;
            String s2 = (String) o2;
            return -s1.compareTo(s2);
        } else if (o1 instanceof StringBuffer && o2 instanceof StringBuffer) {
            String s1 = o1.toString();
            String s2 = o2.toString();
            return -s1.compareTo(s2);
        }
        return 0;
    }
}

