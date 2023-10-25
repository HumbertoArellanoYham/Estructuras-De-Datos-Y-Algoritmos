package queue.excercise3;

/*
 * Ordena un Stack de forma que los elementos más pequeños queden en el tope del Stack.
 * Puedes usar un Stack adicional, pero no está permitido copiar los elementos a otra
 * estructura de datos.
 *
 * Ejemplo:
 *  Input: (tope) 5->1->4->2
 *  Output: (tope) 1->2->4->5
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class StackOrdered {
    public Deque<Integer> ordenar(Deque<Integer> stackA){
        Deque<Integer> stackB = new ArrayDeque<>();

        while(!stackA.isEmpty()){
            Integer topElementStackA = stackA.pop();

            while(!stackB.isEmpty() && topElementStackA > stackB.peek()){
                stackA.push(stackB.pop());
            }

            stackB.push(topElementStackA);
        }

        return stackB;
    }
}
