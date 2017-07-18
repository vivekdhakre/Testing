package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by vivek on 2/4/17.
 */
public class TestExecutor {

    private static Future taskTwo = null;
    private static Future taskThree = null;

    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Runnable task1 = new exec();

        executorService.execute(task1);
        for(int i=0 ; i<2 ; i++){
            if(taskTwo == null || taskTwo.isDone() || taskTwo.isCancelled()){
                taskTwo = executorService.submit(new exec());
            }

            if(taskThree == null || taskThree.isDone() || taskThree.isCancelled()){
                taskThree = executorService.submit(new exec());
            }

            if(taskTwo.get()==null){
                System.out.println(i+1 + ") TaskTwo terminated successfully");
            }else{
                taskTwo.cancel(true);
            }

            if(taskThree.get()==null){
                System.out.println(i+1 + ") taskThree terminated successfully");
            }else{
                taskThree.cancel(true);
            }
        }

        executorService.shutdown();
        System.out.println("---------------------------");
        executorService.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("All tasks are finished");
    }
}

class exec implements Runnable{
    @Override
    public void run() {
        System.out.println("Test18July");
    }
}