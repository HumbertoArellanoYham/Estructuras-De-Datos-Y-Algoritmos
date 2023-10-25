package LinkedList.exercice1;

public class SingleLinkedList {
    public Node head;

    public void appendToTaTail(int valor){
        if(head == null){
            head = new Node(valor);
            return;
        }

        Node actual = head;
        while (actual.next != null){
            actual = actual.next;
        }
        actual.next = new Node(valor);
    }

    public void deleteNode(int valor){
        if(head == null) return;

        if(head.valor == valor){
            head = head.next;
            return;
        }

        Node actual = head;
        while(actual.next != null){
            if(actual.next.valor == valor){
                actual.next = actual.next.next;
                return;
            }

            actual = actual.next;
        }
        
    }

    public void printLinkedList(Node head){
        if(head == null){
            System.out.println("End");
            return;
        }

        Node actual = head;
        while(actual.next != null){
            System.out.print(actual.valor + " ->");
            actual = actual.next;
        }

        System.out.print(actual.valor + " -> End");
    }

}
