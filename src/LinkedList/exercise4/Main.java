package LinkedList.exercise4;

import LinkedList.exercice1.Node;

public class Main {
    public static void main(String[] args) {
        RunnerLinkedList runnerMethod = new RunnerLinkedList();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4); // Valor a retornar
        head.next.next.next = new Node(6);

        Node nodeCreated= runnerMethod.returnPosition(head, 2);

        System.out.println(nodeCreated.valor);
    }
}
