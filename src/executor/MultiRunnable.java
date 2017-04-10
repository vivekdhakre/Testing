package executor;

import java.util.List;

/**
 * Created by vivek on 10/2/17.
 */
public class MultiRunnable implements Runnable {

    private final List<Runnable> runnables;

    public MultiRunnable(List<Runnable> runnables) {
        this.runnables = runnables;
    }

    @Override
    public void run() {
        for(Runnable runnable:runnables){
            new Thread(runnable).start();
        }
    }
}
