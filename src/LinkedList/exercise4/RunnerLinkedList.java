package LinkedList.exercise4;

import LinkedList.exercice1.Node;

public class RunnerLinkedList {
    public Node returnPosition(Node list, int n){
        Node p1 = list;
        Node p2 = list;

        for(int i = 0; i < n; i++){
            if(p1 == null){
                return null;
            }

            p1 = p1.next;
        }

        while (p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }
}
