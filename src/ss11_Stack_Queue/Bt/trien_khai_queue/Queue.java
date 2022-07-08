package ss11_Stack_Queue.Bt.trien_khai_queue;

import java.util.EmptyStackException;
import ss11_Stack_Queue.Bt.trien_khai_queue.Node;
public class Queue {
    private Node front;
    private Node rear;
    private int numNodes;
    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int data){
        Node temp = new Node(data);
        if (front == null){
            front = rear = temp;
            numNodes++;
        }else {
            rear.link = temp;
            rear = temp;
            rear.link = front;
            numNodes++;
        }
    }
    public void deQueue(){
        if (front == null){
            throw new EmptyStackException();
        }else if (front == rear){
            front = rear = null;
            numNodes--;
        }else {
            front = front.link;
            rear.link = null;
            numNodes--;
        }
    }

    public void displayQueue(){
        if (front == null){
            System.out.println("Empty");
        }else {
            Node temp = front;
            for (int i = 0; i < numNodes; i++){
                System.out.println(temp.getData());
                temp = temp.link;
            }
        }
    }
}

