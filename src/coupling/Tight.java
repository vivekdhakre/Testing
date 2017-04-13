package coupling;

/**
 * Created by rtbkit on 30/3/17.
 */
public class Tight {

    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}

class A{
    public void show(){
        System.out.println("Calling A class show Method");
    }
}

class B{
    A a = new A();

    public void show(){
        System.out.println("Calling B class show Method");
        a.show();
    }
}
