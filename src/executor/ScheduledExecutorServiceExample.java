package executor;

import java.util.concurrent.*;

/**
 * Created by vivek on 3/5/17.
 */
public class ScheduledExecutorServiceExample {

    public static void main(String[] args) throws Exception{
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);

        ScheduledFuture scheduledFuture = scheduledExecutorService.schedule(
                new Callable() {
                    public Object call() throws Exception {
                        Thread.sleep(1000);
                        System.out.println("Executed!");
                        return "Called!";
                    }
                },1,TimeUnit.SECONDS);

        System.out.println("result = " + scheduledFuture.get());
//        scheduledExecutorService.shutdown();
    }
}
