package ss10_DSA_Danhsach.Bt.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> array = new MyLinkedList<>();
        array.addFirst(1);
        array.addFirst(2);
        array.addFirst(3);
        array.addFirst(4);
        array.printList();

        System.out.println();

        array.addLast(7);
        array.add(2,2);
        array.printList();

        System.out.println();
        array.remove(4);
        array.printList();

        System.out.println();
        System.out.print(array.getFirst());

        System.out.println();
        array.clear();
        array.addFirst(0);
        //  System.out.println(array.size());
        array.printList();
    }
}
