package review;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = new Node(6);

        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(5);

        Node currentResult = linkedList.twoLinkedListOrdered(head, head2);
        linkedList.printValues(currentResult);
    }
}
