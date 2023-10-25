package implementations;

public class LinkedList {
    private Node head;

    public void appendToTail(int value){
        if(head == null){
            head = new Node(value);
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }

        current.next = new Node(value);
    }

    public void removeElement(int value) {
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

    public void printAllElements(){
        if(head == null){
            System.out.println(" -> End");
            return;
        }

        while(head.next != null){
            System.out.println(head.next.value + " -> ");
            head = head.next;
        }

        System.out.println(head.value + " -> End");
    }
}
