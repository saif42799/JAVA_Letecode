package tiktokCodePractice.Queues;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        

        // Queue = FIFO data structure. First-In First-Out (ex. a line of people)
        //         A collection designed for holding elements prior to processing 
        //         Linear data structure

        //         add    = enqueue, offer()
        //         remove = dequeue, poll()
        

        // createing a queue with a data structure of a string 
        // We cannot instantiate the type Queue because it is a inteface so we 
        // have to use LinkedList to utilize the features of the queue
        Queue<String> queue = new LinkedList<>();

        // offer() - add elemnt 
        // poll()  - remove head of our current queue
        // peek()  - examine the head and return it 


        // adding elements to queue 
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue);


        // peek at head of queue
        System.out.println(queue.peek() + " is at the begining of the line");

        // reomving head at begining of line 
        queue.poll();

        System.out.println(queue);

        System.out.println("Now " + queue.peek() + " is at the begining of the line");


        // check if queue is empty 
        System.out.println(queue.isEmpty());

        // check size of queue
        System.out.println(queue.size());

        // check if queue has a certain object 
        System.out.println(queue.contains("Harold"));
        System.out.println(" ");





        // Priority Queues

        // Priority Queues = A FIFO data structure that serves elements 
        //                   with the highest priorities first 
        //                   before elements with lower priority 

        // data tyoe is queue, insert doubles
        // PriorityQueues places the queue in order, if you with to reverse the order  you can use Collections.reverseOrder()
        Queue<Double> queue2 = new PriorityQueue<>(Collections.reverseOrder()); 
        // adding to queue2 using offer()
        queue2.offer(3.0);
        queue2.offer(2.5);
        queue2.offer(4.0);
        queue2.offer(1.5);
        queue2.offer(2.0);

        // diplay elements of queues
        while (!queue2.isEmpty()) {
            System.out.println(queue2.poll());
        }




    }
    
}
