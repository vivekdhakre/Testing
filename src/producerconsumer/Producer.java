package producerconsumer;

import java.util.concurrent.BlockingQueue;

/**
 * Created by vivek on 29/4/17.
 */
public class Producer implements Runnable {

    private BlockingQueue<Message> queue;

    public Producer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        for(int i=0; i<100; i++){
            Message msg = new Message(""+i);
            try {
                Thread.sleep(10);
                queue.put(msg);
                System.out.println("Produced "+msg.getMsg());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //adding exit message
        Message msg = new Message("exit");
        try {
            queue.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
