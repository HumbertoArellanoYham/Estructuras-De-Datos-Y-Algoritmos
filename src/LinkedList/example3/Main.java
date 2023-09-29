package LinkedList.example3;

import LinkedList.exercise2.LinkedList;
import LinkedList.exercise2.Node;

public class Main {
     public static void main(String[] args){
        MergeTwoLinkedListOrdered mergeToLinkedList = new MergeTwoLinkedListOrdered();
        LinkedList printLinkedListOrdered = new LinkedList();

        // Lista enlazada numero 1
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);
        list1.next.next.next = new Node(6);

         // Lista enlazada numero 2
         Node list2 = new Node(2);
         list2.next = new Node(3);
         list2.next.next = new Node(5);

         Node headMain = mergeToLinkedList.mergeToLinkedListTwice(list1, list2);
         System.out.println(headMain.valor);

         Node current = headMain;
         while(current.next != null){
             System.out.print("(" + current.valor + ") -> ");
             current = current.next;
         }

         System.out.println(current.valor + " end.");
     }
}
