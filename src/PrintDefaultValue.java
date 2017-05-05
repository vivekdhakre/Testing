import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by vivek on 30/4/17.
 */
public class PrintDefaultValue {

    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    boolean b1;
    char c;

    public static void main(String[] args) {
//        System.out.println("default[byte: "+b+" | ");
//        System.out.println("Hello World");
//        int i=0;
//        if(i=0){
//            System.out.println("i="+i);
//        }

//        Integer[] b1 = new Integer[10];
//        int[] b2 = new int[10];
//        System.out.println("b1[1] -> "+b1[1]);
//        System.out.println("b1[2] -> "+b2[1]);

//        double d =10;
//        switch (d){
//
//        }
        //i = 0,
        //

//        int i=0;
//        int j = i++ + i
//                + func(i++) + ++i + func(i++)+i + --i+func(i--)+i+i+func(i--)+ ++i;
//
//        System.out.println(i);
//        System.out.println(j);


        Map<String,String> map = new HashMap<>();
        map.put("A","I");
        map.put("B","II");
        map.put("C","III");
        System.out.println(map);

        Map<String,String> synmap =Collections.synchronizedMap(map);
        int i=0;

        for(Map.Entry<String,String> m:synmap.entrySet()){
            System.out.println(m.getKey()+"|"+m.getValue());
            map.remove(m.getKey());
            System.out.println(m.getKey()+"|"+m.getValue());
            i++;
            map.put("D"+i,i+"");
        }
        System.out.println(synmap);
    }

//    static int func(int i){
//        return i++;
//    }
}
