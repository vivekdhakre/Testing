package singleton;

/**
 * Created by vivek on 31/1/17.
 */
public class Singleton  {
    private static Singleton singleton = new Singleton( );

    private static int i=0;
    /* A private Constructor prevents any other
     * class from instantiating.
     */
    private Singleton() {
        System.out.println("call singleton constructor "+(++i));
    }

//    private static class HoldInstance {
//
//        private static Singleton INSTANCE = new Singleton();
//    }

    /* Static 'instance' method */
    public static Singleton getInstance( ) {

        //1--1++1--11+-12=

//        return singleton;
        return singleton;
    }

    /* Other methods protected by singleton-ness */
    protected void demoMethod( ) {
        System.out.println("demoMethod for singleton");
    }
}
