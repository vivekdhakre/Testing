package executor;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by vivek on 10/2/17.
 */
public class DemoExecutorUsage {

    private static ExecutorService executorService = null;
    private static volatile Future taskOneResults = null;
    private static volatile Future taskTwoResults = null;

    public static void main(String[] args) {
//        executorService = Executors.newFixedThreadPool(2);
        ExecutorService executor = Executors.newWorkStealingPool();


        try{

//            List<Callable<String>> callables = Arrays.asList(
//                    () -> "task1",
//                    () -> "task2",
//                    () -> "task3");
//
//            executor.invokeAll(callables)
//                    .stream()
//                    .map(future -> {
//                        try {
//                            Thread.sleep(2000);
//                            return future.get();
//                        }
//                        catch (Exception e) {
//                            throw new IllegalStateException(e);
//                        }
//                    })
//                    .forEach(System.out::println);



//            List<Callable<String>> callables = Arrays.asList(
//                    callable("task1", 2),
//                    callable("task2", 1),
//                    callable("task3", 3));
//
//            String result = executor.invokeAny(callables);
//            System.out.println(result);

            ScheduledExecutorService executor1 = Executors.newScheduledThreadPool(1);

            Runnable task = () -> System.out.println("Scheduling: " + System.nanoTime());
            ScheduledFuture<?> future = executor1.schedule(task, 1, TimeUnit.SECONDS);

//            TimeUnit.MILLISECONDS.sleep(1337);

            long remainingDelay = future.getDelay(TimeUnit.MILLISECONDS);
            System.out.println("Remaining Delay: "+ remainingDelay);


//            checkTasks();
//            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void checkTasks(){

        if(taskOneResults==null || taskOneResults.isDone() || taskOneResults.isCancelled()){

            taskOneResults = executorService.submit(new Test1());
        }

        if(taskTwoResults ==null || taskTwoResults.isDone() || taskTwoResults.isCancelled()){
            taskTwoResults = executorService.submit(new Test2());
        }
    }

}

class Test1 implements Runnable{

    @Override
    public void run() {

        while(true){
            System.out.println("Executing Task One");

            try{
                Thread.sleep(2000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}


class Test2 implements Runnable{

    @Override
    public void run() {

        while(true){
            System.out.println("Executing Task Two");

            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
