package linkedlisttest;

import java.util.HashSet;

public class LinkedList {
    public Node head;

    public void addNode(int valor){
        if(head == null){
            head = new Node(valor);
            return;
        }

        Node current = head;
        while (current.next != null){
            current = current.next;
        }

        current.next = new Node(valor);
    }

    public void deleteNode(int value){
        if(head == null) return;

        if(head.value == value){
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null){
            if(current.next.value == value){
                current.next = current.next.next;
                return;
            }

            current = current.next;
        }
    }

    public void printNodeValues(Node head){
        if(head == null) {
            System.out.println(" -> End");
            return;
        }

        Node current = head;
        while(current.next != null){
            System.out.println(current.next.value + " -> ");
            current = current.next;
        }

        System.out.println(current.value + " -> End");
    }

    public void removeNodeDuplicates(Node head){
        if(head == null) return;

        HashSet<Integer> nodeFound = new HashSet<>();
        nodeFound.add(head.value);

        Node current = head;
        while(current.next != null){
            if(!nodeFound.add(current.next.value)){
                current.next = current.next.next;
            }

            current = current.next;
        }

    }
}
