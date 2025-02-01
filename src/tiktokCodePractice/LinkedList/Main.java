package tiktokCodePractice.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        
        // LinkedList - stores Nodes in 2 parts (data + address
        //              Nodes are in non-consecutive memory locations 
        //              Elements are linked using pointers 
        //
        //                            Singly Linked List 
        //              Node                 Node                 Node
        //        [ data | address] -> [ data | address] -> [ data | address] 

        //                                            Doubly Linked List 
        //                    Node                           Node                           Node
        //        [ address | data | address] -> [ address | data | address] -> [ address | data | address]
        
                                           
        // advantages:
        //          Dynamic Data structure (allocates neede dmemory while running)
        //          Insertion and Deletion of Nodes are easy 
        //          No/Low memory waste

        // Disadvantage:
        //          Greater memory usage 
        //          time consuming 

        // uses:
        //     Stacks, Queues, GPS nav, music playlist 


        LinkedList<String> linkedList = new LinkedList<>();

        // treating linkedList as a "stack" using the methods 
        // linkedList.push("A");
        // linkedList.push("B");
        // linkedList.push("C");
        // linkedList.push("D");
        // linkedList.push("F");
        // linkedList.pop(); // prints like this: [D, C, B, A]

        // treating linkedList as a "queue" using the methods 
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        // linkedList.poll(); // prints like this: [B, C, D, F]

        // adding a node between D and F
        linkedList.add(4, "E");
        // removing element from linkedList
        linkedList.remove(" E");
        System.out.println("F index in at: " + linkedList.indexOf("F"));

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");

        // store in variable 
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();
        
        System.out.println("Fist: " + first + " Last: " + last);

        System.out.println(linkedList);


    }
    
}
