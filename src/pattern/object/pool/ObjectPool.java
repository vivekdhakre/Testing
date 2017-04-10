package pattern.object.pool;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by vivek on 16/2/17.
 */
public abstract class ObjectPool<T> {

    private ConcurrentLinkedQueue<T> pool;

    private ScheduledExecutorService executorService;

    public ObjectPool(final int minObject) {
        initialize(minObject);
    }

    public ObjectPool(final int minObject, final int maxObject,final long validationInterval){
        initialize(minObject);

        executorService = Executors.newSingleThreadScheduledExecutor();

        executorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {

                int size = pool.size();

                if(size < minObject){
                    int sizeToBeAdded = minObject+size;
                    for(int i=0 ; i<sizeToBeAdded ; i++){
                        pool.add(createObject());
                    }

                }else if(size > maxObject){
                    int sizeToBeRemoved = size - maxObject;
                    for(int i=0 ; i<sizeToBeRemoved ; i++){
                        pool.poll();
                    }
                }
            }
        }, validationInterval,validationInterval, TimeUnit.SECONDS);


    }

    public T borrowObject() {
        T object;
        if ((object = pool.poll()) == null)
        {
            object = createObject();
        }
        return object;
    }

    /*
      Returns object back to the pool.
      @param object object to be returned
  */
    public void returnObject(T object) {
        if (object == null) {
            return;
        }
        this.pool.offer(object);
    }
    /*
         Shutdown this pool.
     */
    public void shutdown(){
        if (executorService != null){
            executorService.shutdown();
        }
    }

    protected abstract T createObject();

    private void initialize(final int minObject){

        pool = new ConcurrentLinkedQueue<T>();

        for(int i=0 ; i<minObject ; i++){
            pool.add(createObject());
        }

    }
}
