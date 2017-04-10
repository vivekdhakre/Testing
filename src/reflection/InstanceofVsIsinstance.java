package reflection;

/**
 * Created by vivek on 6/2/17.
 */
public class InstanceofVsIsinstance {

    // This method tells us whether the object is an
    // instance of class whose name is passed as a
    // string 'c'.
    public static boolean fun(Object obj, String c)
            throws ClassNotFoundException
    {
        return Class.forName(c).isInstance(obj);
    }

    public static void main(String[] args) throws Exception{

        Integer i = new Integer(5);

        // prints true as i is instance of class
        // Integer
        System.out.println(i instanceof Integer);



        Integer i1 = new Integer(5);

        // print true as i is instance of class
        // Integer
        boolean b = fun(i1, "java.lang.Integer");

        // print false as i is not instance of class
        // String
        boolean b1 = fun(i1, "java.lang.String");

        /* print true as i is also instance of class
           Number as Integer class extends Number
           class*/
        boolean b2 = fun(i1, "java.lang.Number");

        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
    }
}
