package LinkedList.example3;

import LinkedList.exercise2.*;

public class MergeTwoLinkedListOrdered {

    public Node mergeToLinkedListTwice(Node list1, Node list2){
        Node head = new Node(Integer.MIN_VALUE);
        Node current = head;

        while(list1 != null && list2 != null){
            if(list1.valor <= list2.valor){
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if(list1 == null){
            appendToLinkedList(current, list2);
        } else{
            appendToLinkedList(current, list1);
        }

        return head.next;
    }

    public void appendToLinkedList(Node current, Node anyListToAppend){
        while(anyListToAppend != null){
            current.next = anyListToAppend;
            anyListToAppend = anyListToAppend.next;
            current = current.next;
        }
    }
}
