package LinkedList.example6;

import LinkedList.exercice1.Node;
import LinkedList.exercice1.SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList methodLinkedList = new SingleLinkedList();
        IntercambioDePares exchange = new IntercambioDePares();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(8);

        Node result = exchange.intercambioDeNumeros(head);

        methodLinkedList.printLinkedList(result);
    }
}
