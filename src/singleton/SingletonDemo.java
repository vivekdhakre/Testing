package singleton;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by vivek on 31/1/17.
 */
public class SingletonDemo {

    public static void main(String[] args) {
//        Singleton s = new Singleton();
        Singleton tmp = Singleton.getInstance( );
        tmp.demoMethod( );

        int i ;
//        i = 4++2--1+-1;
//        System.out.println(i);

        Singleton tmp1 = Singleton.getInstance( );
        tmp1.demoMethod( );
    }
}
