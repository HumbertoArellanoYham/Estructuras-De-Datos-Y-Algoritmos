package queue.exercise1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Primer elemento " + queue.peek());
        System.out.println("Longitud de la cola " + queue.size());
        System.out.println("Eliminar elemento " + queue.remove());
        System.out.println("Segundo elemento" + queue.peek());

        queue.add(4);
        System.out.println("Segundo elemento" + queue.peek());
        System.out.println("Longitud de la cola " + queue.size());

        System.out.println("Eliminar elemento " + queue.remove());
        System.out.println("Eliminar elemento " + queue.remove());
        System.out.println("Segundo elemento" + queue.peek());
    }
}
