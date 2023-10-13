package LinkedList.exercice1;

import java.util.HashSet;

public class DeleteNodeDups {

    public void removeDups(Node head) {
        HashSet<Integer> foundValues = new HashSet<>();
        foundValues.add(head.valor);
        Node current = head;

        while (current != null && current.next != null) {
            if (!foundValues.add(current.next.valor)) {
                // Si ya hemos encontrado ese nodo debemos eliminarlo
                current.next = current.next.next;
            }

            // Por último avanzamos el nodo actual para seguir iterando sobre la lista
            current = current.next;
        }
    }
}
