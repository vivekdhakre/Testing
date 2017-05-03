package producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by vivek on 29/4/17.
 */
public class ProducerConsumerDemo {

    public static void main(String[] args) throws Exception{

        BlockingQueue<Message> queue = new ArrayBlockingQueue<Message>(10);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        //starting producer to produce messages in queue
        new Thread(producer).start();
        //starting consumer to consume messages from queue
        new Thread(consumer).start();
        System.out.println("Producer and Consumer has been started");
    }
}
