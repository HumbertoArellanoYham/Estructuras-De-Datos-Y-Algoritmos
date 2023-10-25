package LinkedList.exercise2;

public class LinkedList {
    public Node head;

    public void addNodeToLinkedList(int value){
        if(head == null){
            head = new Node(value);
            return;
        }

        Node nodoActual = head;
        while(nodoActual.next != null){
            nodoActual = nodoActual.next;
        }

        nodoActual.next = new Node(value);
    }

    public void deleteNodo(int value){
        if(head == null){
            return;
        }

        if(head.valor == value){
            head = head.next;
            return;
        }

        Node nodeAuxiliar = head;
        while(nodeAuxiliar.next != null){
            if(nodeAuxiliar.next.valor != value){
                nodeAuxiliar.next = nodeAuxiliar.next.next;
                return;
            }

            nodeAuxiliar = nodeAuxiliar.next;
        }
    }

    public void printTheLinkedList(){
        if(head == null){
            System.out.println("End");
            return;
        }

        Node nodeAux = head;
        while(nodeAux.next != null){
            System.out.println(nodeAux.valor + " -> ");
            nodeAux = nodeAux.next;
        }

        System.out.println(nodeAux.valor + " -> END");
    }

}
