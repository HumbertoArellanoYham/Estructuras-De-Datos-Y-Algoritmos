package LinkedList.example5;

import LinkedList.exercice1.Node;

public class Main {
    public static void main(String[] args) {
        SumTwoLinkedList sumTwoLinkedList = new SumTwoLinkedList();

        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);
        list1.next.next.next = new Node(6);


        Node list2 = new Node(5);
        list2.next = new Node(2);
        list2.next.next = new Node(8);

        Node result = sumTwoLinkedList.returnSumLinkedListTwice(list1, list2);

        printNodes(result);
    }

    public static void printNodes(Node result){
        if(result == null) System.out.println("Esta vacia");;

        while(result != null){
            System.out.print(result.valor + " -> ");
            result = result.next;
        }

        System.out.print("end");
    }
}
