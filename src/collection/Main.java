package collection;

import java.util.*;

/**
 * Created by vivek on 7/2/17.
 */
public class Main {

    public static void main(String[] args) {

//        // Create a link list which stores integer elements
//        List<Integer> l = new LinkedList<>();
//
//        // Now add elements to the Link List
//        l.add(2);
//        l.add(3);
//        l.add(4);
//
//        // Make another Link List which stores integer elements
//        List<Integer> s=new LinkedList<Integer>();
//        s.add(7);
//        s.add(8);
//        s.add(9);
//
//        // Iterator to iterate over a Link List
//        for (Iterator<Integer> itr1 = l.iterator(); itr1.hasNext(); )
//        {
//            for (Iterator<Integer> itr2=s.iterator(); itr2.hasNext(); )
//            {
//                System.out.println(itr1.next()+" - "+itr2.next());
//                if (itr1.next() < itr2.next())
//                {
//                    System.out.println(itr1.next());
//                }
//            }
//        }


        HashMap<String,String> map = new HashMap<>();
        map.put("Language","Java");
        map.put("Code","HashMap");
        map.put("Learn","More");

        Set<Map.Entry<String,String>> mapping = map.entrySet();
        System.out.println(mapping);
        System.out.println();

        System.out.println("Using .getOrDefault: "+ map.getOrDefault("Code","JavaArticle"));

        System.out.println("Using .getOrDefault: "+ map.getOrDefault("Search","javaArticle"));

        // .replace() method replacing value of key "Learn"
        map.replace("Learn", "Methods");
        System.out.println("working of .replace()    : "+mapping);
        System.out.println();

        /* .putIfAbsent() method is placing a new key-value
            as they were not present initially*/
        map.putIfAbsent("cool", "HashMap methods");
        System.out.println("working of .putIfAbsent() : "+mapping);

        /* .putIfAbsent() method is not doing anything
            as key-value were already present */
        map.putIfAbsent("Code", "With_JAVA");
        System.out.println("working of .putIfAbsent() : "+mapping);

    }
}
