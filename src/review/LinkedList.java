package review;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
    public void add(Node head, int value){
        if(head == null) {
            new Node(value);
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }

        current.next = new Node(value);
    }

    public void remove(Node head, int value){
        if(head == null) return;

        Node current = head;
        while(current.next != null){
            if(current.value == value){
                current.next = current.next.next;
            }

            current = current.next;
        }
    }

    public void printValues(Node head){
        if(head == null){
            System.out.print(" ->End");
            return;
        }

        Node current = head;
        while(current.next != null){
            System.out.print(current.value + " ->");
            current = current.next;
        }

        System.out.print(current.value + "-> null");
    }

    public void removeDuplicated(Node head){
        Set<Integer> nodesUnique = new HashSet<>();
        nodesUnique.add(head.value);

        Node current = head;
        while (current != null && current.next != null) {
            if(!nodesUnique.add(current.next.value)){
                current.next = current.next.next;
            }

            current = current.next;
        }
    }

    public Node twoLinkedListOrdered(Node list1, Node list2){
       Node head = new Node(Integer.MIN_VALUE);
       Node current = head;

       while(list1 != null && list2 != null){
           if(list1.value <= list2.value){
               current.next = list1;
               list1 = list1.next;
           } else {
               current.next = list2;
               list2 = list2.next;
           }

           current = current.next;
       }

       if(list1 == null){
           joinLinkedList(current, list2);
       } else {
           joinLinkedList(current, list1);
       }

       return head.next;
    }

    private static void joinLinkedList(Node current, Node listToJoin){
        while(listToJoin != null){
            current.next = listToJoin;
            listToJoin = listToJoin.next;
            current = current.next;
        }
    }

    public Node runner(Node head, int position){
        if(head == null) return null;

        Node p1 = head;
        Node p2 = head;

        for(int i = 0; i < position; i++){
            p2 = p2.next;
        }

        while(p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }
}
