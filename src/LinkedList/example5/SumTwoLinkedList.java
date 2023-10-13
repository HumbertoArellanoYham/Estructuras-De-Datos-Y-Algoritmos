package LinkedList.example5;

import LinkedList.exercice1.Node;

public class SumTwoLinkedList {
    public Node returnSumLinkedListTwice(Node list1, Node list2){
        Node result = new Node(-1);
        Node current = result;

        int carry = 0;

        while(list1 != null || list2 != null){
            current.next = new Node(-1);
            current = current.next;

            int digit = carry;

            if(list1 != null){
                digit += list1.valor;
                list1 = list1.next;
            }

            if(list2 != null){
                digit += list2.valor;
                list2 = list2.next;
            }

            carry = digit / 10;
            digit = digit % 10;

            current.valor = digit;
        }

        if(carry > 0){
            current.next = new Node(carry);
        }

        return result.next;
    }
}
