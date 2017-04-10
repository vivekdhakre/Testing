package threadsdemo;

/**
 * Created by vivek on 2/4/17.
 */
public class InterfaceAbstract extends TestAbstract{

//    @Override
//    public void show() {
//        System.out.println("inside implement class");
//    }

    @Override
    public void show1() {
        System.out.println("inside implement show1");
    }

    public static void main(String[] args) {
        TestInterface ia = new InterfaceAbstract();
        ia.show();
//        ia.show1();
    }

}

abstract class TestAbstract implements TestInterface{

    public abstract void show1();

    @Override
    public void show(){
        System.out.println("inside abstract class - show");
    }

    public void show2(){
        System.out.println("inside abstract class - show2");
    }
}

interface TestInterface{
    public void show();
}
