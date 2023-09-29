package LinkedList.exercice1;

public class Main {
    public static void main(String[] args) {
        DeleteNodeDups removeNodes = new DeleteNodeDups();

        Node head = new Node(1);
        head.next= new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(1);

        showLinkedList(head);
        removeNodes.removeDups(head);

        System.out.print(System.lineSeparator());

        showLinkedList(head);
    }

    private static void showLinkedList(Node head){
        if(head == null){
            System.out.println("END");

            return;
        }

        Node actual = head;
        while(actual.next != null){
            System.out.print(actual.valor + " -> ");
            actual = actual.next;
        }

        System.out.print(actual.valor + " ->");
    }
}
