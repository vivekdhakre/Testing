import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by vivek on 27/3/17.
 */
public class TestArray {
    public static void main(String[] args) {
        int arr[]={4,4,5};



//        Class c=arr.getClass();
//        String name=c.getName();
//
//        System.out.print(name);

//        String str1 ="abc";
//        String str2 ="abc";
//        String str3 = new String("abc");
//        System.out.println("str1==str2 "+(str1==str2));
//        System.out.println("str1.equals(str2) "+(str1.equals(str2)));
//        System.out.println("str1==str3 "+(str1==str3));
//        System.out.println("str1.equals(str3) "+(str1.equals(str3)));
//        str3 = str3.intern();
//
//        System.out.println("str1==str3 "+(str1==str3));

//        List<String> list = new ArrayList<>();
//        list.add("vivek");
//        list.add("Pankaj");
//        list.add("Atul");
//
//        list.forEach(lst -> System.out.println(lst));
//
//        Iterator it = list.iterator();
//        while(it.hasNext()){
//            if(it.next().toString().equals("vivek"))it.remove();
//            list.add("xyz");
//        }
//
//        list.forEach(lst -> System.out.println(lst));

        //Creating a ConcurrentHashMap

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();

        //Adding elements to map

        map.put("ONE", 1);

        map.put("TWO", 2);

        map.put("THREE", 3);

        map.put("FOUR", 4);

        //Getting an Iterator from map

        System.out.println(map);
        Iterator<String> it = map.keySet().iterator();

        while (it.hasNext())
        {
            String key = (String) it.next();
            it.remove();
            System.out.println(key+" : "+map.get(key));

            map.put("FIVE", 5);     //This will not be reflected in the Iterator
        }

        System.out.println(map);
//        System.co
    }


}
