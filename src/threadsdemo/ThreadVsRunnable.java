package threadsdemo;

/**
 * Created by vivek on 11/2/17.
 */
public class ThreadVsRunnable{

    public static void main(String[] args) throws Exception{

        ImplementsRunnable rc = new ImplementsRunnable();
        Thread t1 = new Thread(rc);
        t1.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread
        Thread t2 = new Thread(rc);
        t2.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread
        Thread t3 = new Thread(rc);
        t3.start();

        //Creating new instance for every thread access.
        ExtendsThread tc1 = new ExtendsThread();
        tc1.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread
        ExtendsThread tc2 = new ExtendsThread();
        tc2.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread
        ExtendsThread tc3 = new ExtendsThread();
        tc3.start();

    }
}

class ImplementsRunnable implements Runnable {

    private int counter = 0;

    public void run() {
        counter++;
        System.out.println("ImplementsRunnable : Counter : " + counter);
    }
}

class ExtendsThread extends Thread {

    private int counter = 0;

    public void run() {
        counter++;
        System.out.println("ExtendsThread : Counter : " + counter);
    }
}
