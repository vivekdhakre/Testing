package geeksforgeeks;

/**
 * Created by ahoy on 2/6/17.
 */
public class InstanceInitializationBlock {


    {
        System.out.println("Instance Initialization block");
    }

    InstanceInitializationBlock() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
//        InstanceInitializationBlock iib = new InstanceInitializationBlock();

        A a = new A();
    }
}

class B {

    static {
        System.out.println("static block B");
    }

    {
        System.out.println("B-IIB block");
    }

    B() {
        System.out.println("B-Constructor Called");
    }

}

class A extends B {

    static {
        System.out.println("static block");
    }

    {
        System.out.println("A-IIB block");
    }

    A() {
//        super();
        System.out.println("A-Constructor Called");
    }

    // main function
//    public static void main(String[] args)
//    {
//        A a = new A();
//    }
}
