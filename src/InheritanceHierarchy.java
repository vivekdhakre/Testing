/**
 * Created by ahoy on 10/5/17.
 */
public class InheritanceHierarchy {

    public static void main(String[] args) {
        B c = new C();
        c.show();
    }
}

class A {

    public A() {
        System.out.println("Call A Constructor");
    }

    public void show() {
        System.out.println("A class show Method");
    }
}

class B extends A {
    public B() {
        System.out.println("Call B Constructor");
    }

    public void show() {
        System.out.println("B class show Method");
    }
}

class C extends B {
    public C() {
        System.out.println("Call C Constructor");
    }

//    public void show(){
//        System.out.println("C class show Method");
//    }
}
