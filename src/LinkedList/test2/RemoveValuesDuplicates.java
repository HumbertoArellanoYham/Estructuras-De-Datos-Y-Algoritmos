package LinkedList.test2;

import java.util.HashSet;

public class RemoveValuesDuplicates {
    public void removeDuplicates(Node head){
        HashSet<Integer> foundElements = new HashSet<>();
        foundElements.add(head.value);

        Node current = head;
        while(current != null && current.next != null){
            if(!foundElements.add(current.next.value)){
                current.next = current.next.next;
            }

            current = current.next;
        }
    }
}
