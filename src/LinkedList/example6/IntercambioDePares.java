package LinkedList.example6;

import LinkedList.exercice1.Node;

public class IntercambioDePares {
    public Node intercambioDeNumeros(Node head){
        if(head == null || head.next == null) return head;

        Node temporal = head.next.next;
        head.next.next = head;
        head = head.next;
        head.next.next = intercambioDeNumeros(temporal);

        return head;
    }
}
