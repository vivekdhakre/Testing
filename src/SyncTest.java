/**
 * Created by vivek on 11/11/16.
 */
public class SyncTest {

    public static void main(String[] args){

        Thread t = new Thread(){
            Foo f = new Foo();
            public void run(){
                f.increase(20);
            }
        };
        t.start();
    }
}

class Foo{
    private int data =23;
    public void increase(int amt){
        int x = data;
        data = x +amt;
    }

}
