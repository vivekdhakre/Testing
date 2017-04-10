package pattern.object.pool;

/**
 * Created by vivek on 16/2/17.
 */
public class ExportingTask implements Runnable {

    private ObjectPool<ExportingProcess> pool;

    private int threadNo;

    public ExportingTask(ObjectPool<ExportingProcess> pool, int threadNo) {
        this.pool = pool;
        this.threadNo = threadNo;
    }

    @Override
    public void run() {

        ExportingProcess exportingProcess = pool.borrowObject();
        System.out.println("Thread "+threadNo+": object with process no."+exportingProcess.getProcessNo()+" was borrowed");

        pool.returnObject(exportingProcess);
        System.out.println("Thread "+threadNo+": object with process no."+exportingProcess.getProcessNo()+" was returned");

    }
}
