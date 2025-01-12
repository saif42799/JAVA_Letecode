package tiktokCodePractice.Day1;

public class nodesMain {
    public static void main(String[] args) {
     
        Node nodes1 = new Node();
        // node1 == int data = 1
        nodes1.data = 1;

        Node nodes2 = new Node();
        // node2 == int data = 2
        nodes2.data = 2;
        // creating referance thats saying node 1.next = 2 
        nodes1.next = nodes2;

        Node nodes3 = new Node();
        nodes3.data = 3;
        nodes2.next = nodes3;

        Node nodes4 = new Node();
        nodes4.data = 4;
        nodes3.next = nodes4;

        Node nodes5 = new Node();
        nodes5.data = 5;
        nodes4.next = nodes5;
        
        Node head = nodes1;
        
        System.out.println("");
        traversalLinkedList(head);
        

    }

    public static void traversalLinkedList(Node head){

        // traversal loop
        Node temp = head;
        while (temp != null) { 
            
            System.out.println(temp.data + " ");
            temp = temp.next;
        }

    }


}
