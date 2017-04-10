package collection;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by vivek on 28/2/17.
 */
public class QueueExample {

    public static void main(String[] args) {
        Queue<Book> queue = new PriorityQueue<>();

        Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(233,"Operating System","Galvin","Wiley",6);
        Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        //Adding Books to the queue
        System.out.println(queue.add(b1));
        System.out.println(queue.offer(b2));
        queue.add(b3);
        System.out.println("Traversing the queue elements:");
        //Traversing queue elements
        for(Book b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
        System.out.println(queue.remove());
        System.out.println("After removing one book record:");
        for(Book b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
        System.out.println(queue.remove());
        System.out.println("After removing one book record:");
        for(Book b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }

    }
}

class Book implements Comparable<Book>{

    int id;
    String name,author,publisher;
    int quantity;

    public Book(int id, String name,String author,String publisher, int quantity){
        this.id = id;
        this.name = name;
        this.author =author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Book o) {
        System.out.println(this.id+" | "+o.id);
        if(this.id > o.id)
            return 1;
        else if(this.id< o.id)
            return -1;
        else
            return 0;

    }
}