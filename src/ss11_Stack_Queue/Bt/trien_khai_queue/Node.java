package ss11_Stack_Queue.Bt.trien_khai_queue;

public class Node {
    public Node link;
    private int data;
    public Node(int data) {
        this.data = data;
        this.link = null;
    }

    public int getData() {
        return data;
    }
}
