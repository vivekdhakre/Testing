package executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by vivek on 10/2/17.
 */
public class MultiTaskExecutor {

    public static void main(String[] args) {

        BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue<Runnable>(10);

        RejectedExecutionHandler rejectedExecutionHandler = new RejectedExecutionHandlerImpl();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(3,3,3, TimeUnit.SECONDS,blockingQueue,rejectedExecutionHandler);

        executor.prestartAllCoreThreads();

        List<Runnable> taskGroup = new ArrayList<>();
        taskGroup.add(new TaskOne());
        taskGroup.add(new TaskTwo());
        taskGroup.add(new TaskThree());

        blockingQueue.add(new MultiRunnable(taskGroup));

    }
}

class RejectedExecutionHandlerImpl implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println(r.toString() + " I have Rejected");
    }
}

class TaskOne implements Runnable {
    @Override
    public void run() {
        System.out.println("Executing Task One");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class TaskTwo implements Runnable {
    @Override
    public void run() {
        System.out.println("Executing Task Two");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class TaskThree implements Runnable {
    @Override
    public void run() {
        System.out.println("Executing Task Three");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
